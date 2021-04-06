package com.mp.android.apps.monke.monkeybook.common.api;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface InsNovelAPI {

    //新版本使用
    @GET
    Single<String> getChapterLists(@Url String url);

    @GET
    Single<String> getChapterInfo(@Url String url);
}

