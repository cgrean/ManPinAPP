package com.mp.android.apps.monke.monkeybook.model.impl;

import android.net.Uri;

import com.google.gson.Gson;
import com.mp.android.apps.monke.monkeybook.base.MBaseModelImpl;
import com.mp.android.apps.monke.monkeybook.bean.ChapterBean;
import com.mp.android.apps.monke.monkeybook.bean.ChapterList;
import com.mp.android.apps.monke.monkeybook.bean.SearchBookBean;
import com.mp.android.apps.monke.monkeybook.common.api.InsNovelAPI;
import com.mp.android.apps.monke.monkeybook.model.IReaderBookModel;
import com.mp.android.apps.monke.readActivity.bean.BookChapterBean;
import com.mp.android.apps.monke.readActivity.bean.ChapterInfoBean;
import com.mp.android.apps.monke.readActivity.bean.CollBookBean;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

public class InsNovelBookModelImpl extends MBaseModelImpl implements IReaderBookModel {
    public static final String TAG = "https://www.insnovel.com";
    public static final String TAG_TEST = "https://test.insnovel.com";
    private String MyTAG;

    public static InsNovelBookModelImpl getInstance() {
        return new InsNovelBookModelImpl();
    }

    private InsNovelBookModelImpl() {

    }

    @Override
    public Observable<List<SearchBookBean>> searchBook(String content, int page) {
        return null;
    }

    @Override
    public Observable<CollBookBean> getBookInfo(CollBookBean collBookBean) {
        return null;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////    @Override
    public Single<List<BookChapterBean>> getBookChapters(CollBookBean collBookBean) {
        Uri uri = Uri.parse(collBookBean.getBookChapterUrl());
        MyTAG = uri.getScheme() + "://" + uri.getHost();
        return getRetrofitObjectInsNovel(MyTAG).create(InsNovelAPI.class).getChapterLists(collBookBean.getBookChapterUrl())
                .flatMap(new Function<String, Single<List<BookChapterBean>>>() {
                    @Override
                    public Single<List<BookChapterBean>> apply(String s) throws Exception {
                        return Single.create(new SingleOnSubscribe<List<BookChapterBean>>() {
                            @Override
                            public void subscribe(SingleEmitter<List<BookChapterBean>> emitter) throws Exception {
                                emitter.onSuccess(analyChapterlist(s, collBookBean));
                            }
                        });
                    }
                });
    }

    private List<BookChapterBean> analyChapterlist(String s, CollBookBean collBookBean) {
        ChapterList chapterLists = null;
        try{
            chapterLists = new Gson().fromJson(s,ChapterList.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(chapterLists == null){
            chapterLists = new ChapterList();
        }
        List<ChapterList.ItemsBean> chapterlist = chapterLists.getItems();
        if(chapterlist == null){
            chapterlist = new ArrayList<>();
        }
        List<BookChapterBean> chapterBeans = new ArrayList<BookChapterBean>();
        for (int i = 0; i < chapterlist.size(); i++) {
            int index = i+1;
            BookChapterBean temp = new BookChapterBean();
            StringBuilder linkUrl = new StringBuilder(MyTAG)
                    .append("/api/visitor/chapters/content?bookId=")
                    .append(collBookBean.get_id())
                    .append("&chapterIndex=").append(index)
                    .append("&channel=")
                    .append("1000");
            temp.setId(chapterlist.get(i).getUuid());
            temp.setTitle(chapterlist.get(i).getTitle());
            temp.setLink(linkUrl.toString());
            temp.setPosition(i);
            temp.setBookId(collBookBean.get_id());
            temp.setUnreadble(false);
            chapterBeans.add(temp);
        }
        return chapterBeans;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //==================================获取章节内容(具体的阅读内容)
    @Override
    public Single<ChapterInfoBean> getChapterInfo(String url) {
        Uri uri = Uri.parse(url);
        MyTAG = uri.getScheme() + "://" + uri.getHost();
        return getRetrofitObjectInsNovel(MyTAG).create(InsNovelAPI.class).getChapterInfo(url).flatMap(new Function<String, SingleSource<? extends ChapterInfoBean>>() {
            @Override
            public SingleSource<? extends ChapterInfoBean> apply(String s) throws Exception {
                return Single.create(new SingleOnSubscribe<ChapterInfoBean>() {
                    @Override
                    public void subscribe(SingleEmitter<ChapterInfoBean> emitter) throws Exception {
                        emitter.onSuccess(analysisChapterInfo(s, url));
                    }
                });
            }
        });
    }

    private ChapterInfoBean analysisChapterInfo(String s, String url) {
        ChapterInfoBean chapterInfoBean = new ChapterInfoBean();
        try {
            ChapterBean chapterBean = new Gson().fromJson(s,ChapterBean.class);
            Document doc = Jsoup.parse(chapterBean.getPcontent());
            Elements contentEs = doc.getElementsByTag("p");
            StringBuilder content = new StringBuilder();
            for (int i = 0; i < contentEs.size(); i++) {
                String temp = contentEs.get(i).text();
                temp = temp.replaceAll(" ", "").replaceAll(" ", "");
                if (temp.length() > 0) {
                    content.append("\u3000\u3000" + temp);
                    if (i < contentEs.size() - 1) {
                        content.append("\r\n");
                    }
                }
            }
            chapterInfoBean.setBody(content.toString());
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return chapterInfoBean;
    }

}


