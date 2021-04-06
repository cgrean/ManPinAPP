package com.mp.android.apps.monke.monkeybook.bean;

import java.util.List;

public class ChapterList {

    /**
     * items : [{"title":"Chapter 1: Adam","chapter_index":1,"uuid":"1910d444633d6b894cf25c4c82d6663f","content_len":14435,"word_count":2623,"cost":14,"lock":0},{"title":"Chapter 2: Adam","chapter_index":2,"uuid":"86f7388564d03fbbeaff55d29b6029dd","content_len":15163,"word_count":2668,"cost":14,"lock":0},{"title":"Chapter 3: Felix","chapter_index":3,"uuid":"1565a975020e36d816685a561084fef2","content_len":541638,"word_count":2661,"cost":14,"lock":0},{"title":"Chapter 4: Adam","chapter_index":4,"uuid":"a53e578edb990a4d04e829b7ecdf52a2","content_len":15598,"word_count":2720,"cost":14,"lock":0},{"title":"Chapter 5: Adam","chapter_index":5,"uuid":"de60410096ac0a4693105bee463769bb","content_len":14669,"word_count":2551,"cost":13,"lock":0},{"title":"Chapter 6: Adam","chapter_index":6,"uuid":"7187282ab2fa3b23fac24c37b940c943","content_len":8281,"word_count":1461,"cost":8,"lock":0},{"title":"Chapter 7: Felix","chapter_index":7,"uuid":"f21990a4c46834f4ef94ad35888a0ecb","content_len":5023,"word_count":851,"cost":5,"lock":0},{"title":"Chapter 8: Adam","chapter_index":8,"uuid":"8236a86537b9d23e6eeec4aa6a3a45c3","content_len":6687,"word_count":1179,"cost":6,"lock":0},{"title":"Chapter 9: Felix","chapter_index":9,"uuid":"d5af422cdb6aed8fda2e2027e659d0db","content_len":6346,"word_count":1137,"cost":6,"lock":0},{"title":"Chapter 10: Adam","chapter_index":10,"uuid":"add80b757109eb7bbca3ff1a41b496e0","content_len":15843,"word_count":2764,"cost":14,"lock":0},{"title":"Chapter 11: Adam","chapter_index":11,"uuid":"ceef01c231f2d2e7f7785891bb88e02a","content_len":7505,"word_count":1360,"cost":7,"lock":0},{"title":"Chapter 12: Adam","chapter_index":12,"uuid":"6c682a0551e1d674683f9bcad09aeb42","content_len":14659,"word_count":2732,"cost":14,"lock":0},{"title":"Chapter 13: Adam","chapter_index":13,"uuid":"8b729498edd914337d58452a94263cb1","content_len":10051,"word_count":1851,"cost":10,"lock":0},{"title":"Chapter 14: Felix","chapter_index":14,"uuid":"f3667fd72e1af346fe2b3693351d37fb","content_len":15624,"word_count":2767,"cost":14,"lock":0},{"title":"Chapter 15: Adam","chapter_index":15,"uuid":"4aa3181f32fe23601442715ac1b3202a","content_len":13380,"word_count":2401,"cost":13,"lock":0},{"title":"Chapter 16: Felix","chapter_index":16,"uuid":"56b7790c15ce4eed7dbce04f6d0af4a3","content_len":12094,"word_count":2215,"cost":12,"lock":0},{"title":"Chapter 17: Felix","chapter_index":17,"uuid":"10fda2c25eba43932933f4a35b68ff04","content_len":8640,"word_count":1577,"cost":8,"lock":0},{"title":"Chapter 18: Adam","chapter_index":18,"uuid":"7d2699563e394d1f308b93e6194d8e28","content_len":15229,"word_count":2776,"cost":14,"lock":0},{"title":"Chapter 19: Adam","chapter_index":19,"uuid":"11126273d12ba7eed028b9198be9f482","content_len":15520,"word_count":2859,"cost":15,"lock":0},{"title":"Chapter 20: Felix","chapter_index":20,"uuid":"fa859a803f637a352dd677b91e2e5eff","content_len":9607,"word_count":1732,"cost":9,"lock":0},{"title":"Chapter 21: Adam","chapter_index":21,"uuid":"b8bc6ef04b427564eb98e998348794dc","content_len":15637,"word_count":2792,"cost":14,"lock":0},{"title":"Chapter 22: Adam","chapter_index":22,"uuid":"21908f4c6431ed8db3ac5b5c2688330b","content_len":8755,"word_count":1582,"cost":8,"lock":0},{"title":"Chapter 23: Felix","chapter_index":23,"uuid":"00dd3b7ebdee791107949428eb9dd996","content_len":10830,"word_count":1946,"cost":10,"lock":0},{"title":"Chapter 24: Felix","chapter_index":24,"uuid":"3107e45dce0799c641878d3b729391b9","content_len":15674,"word_count":2820,"cost":15,"lock":0},{"title":"Chapter 25: Adam","chapter_index":25,"uuid":"77004fd160e0c758f5c5b93466e144ab","content_len":15085,"word_count":2774,"cost":14,"lock":0},{"title":"Chapter 26: Adam","chapter_index":26,"uuid":"4d202143adbb6d56d159256ee67288bf","content_len":7566,"word_count":1366,"cost":7,"lock":0},{"title":"Chapter 27: Adam","chapter_index":27,"uuid":"55ec0b5e247334e7437e10d865856c6b","content_len":13235,"word_count":2482,"cost":13,"lock":0},{"title":"Chapter 28: Adam","chapter_index":28,"uuid":"b14a0b6c3cbaf75e99b9343ad1fcb2af","content_len":5140,"word_count":909,"cost":5,"lock":0},{"title":"Chapter 29: Adam","chapter_index":29,"uuid":"9043c8c92774c9075d6f8f5ff035eb13","content_len":749936,"word_count":2471,"cost":13,"lock":0},{"title":"Chapter 30: Adam","chapter_index":30,"uuid":"c8cf8919a83115527703c7506a884821","content_len":11608,"word_count":2139,"cost":11,"lock":0},{"title":"Chapter 31: Felix","chapter_index":31,"uuid":"009812d9cc2cffa220127c5202416db5","content_len":10585,"word_count":1906,"cost":10,"lock":0},{"title":"Chapter 32: Felix","chapter_index":32,"uuid":"82c8c7773a71cbd48bf7d6421a484780","content_len":13826,"word_count":2424,"cost":13,"lock":0},{"title":"Chapter 33: Felix","chapter_index":33,"uuid":"ec87c9cfce62ac1b67ffc7421abe88b4","content_len":12648,"word_count":2288,"cost":12,"lock":0},{"title":"Chapter 34: Felix","chapter_index":34,"uuid":"ea8e4c4dc1cf2d77aec4afa138bd446e","content_len":4447,"word_count":816,"cost":5,"lock":0},{"title":"Chapter 35: Adam","chapter_index":35,"uuid":"a11961fb8578f7c5eda380fdd96ac327","content_len":11158,"word_count":1939,"cost":10,"lock":0},{"title":"Chapter 36: Felix","chapter_index":36,"uuid":"b210b92d16314de0ad0dfad1c75afefe","content_len":15453,"word_count":2752,"cost":14,"lock":0},{"title":"Chapter 37: Felix","chapter_index":37,"uuid":"e058116247bcab6e98a7ead4530bb4ee","content_len":10479,"word_count":1811,"cost":10,"lock":0},{"title":"Chapter 38: Adam","chapter_index":38,"uuid":"29f870a6eef954fa9cc3681627cb57c9","content_len":6070,"word_count":1149,"cost":6,"lock":0},{"title":"Chapter 39: Adam","chapter_index":39,"uuid":"8a102b79c488453a0624add7de8ab139","content_len":13153,"word_count":2486,"cost":13,"lock":0},{"title":"Chapter 40: Jennifer Cross","chapter_index":40,"uuid":"1e3a34d3ccb111c458bbfa1c1c807030","content_len":6099,"word_count":1056,"cost":6,"lock":0},{"title":"Chapter 41: Felix","chapter_index":41,"uuid":"5cfc8906f4b41420fdba8cd72d8b71fc","content_len":14215,"word_count":2528,"cost":13,"lock":0},{"title":"Chapter 42: Adam","chapter_index":42,"uuid":"8439c067ad6491ffb0e02788ec17ccf6","content_len":11829,"word_count":2132,"cost":11,"lock":0},{"title":"Chapter 43: Felix","chapter_index":43,"uuid":"11c93b2a8af4b214c5a193f26bc70aaf","content_len":14529,"word_count":2611,"cost":14,"lock":0},{"title":"Chapter 44: Felix","chapter_index":44,"uuid":"288349a5f69420b178ddbaccf4d5bbca","content_len":11365,"word_count":2039,"cost":11,"lock":0},{"title":"Chapter 45: Felix","chapter_index":45,"uuid":"aa3c4f8cb0ed71ec524e572dd82bcf89","content_len":9158,"word_count":1694,"cost":9,"lock":0},{"title":"Chapter 46: Adam","chapter_index":46,"uuid":"fdaa8763f80cfbb359559e3e2d97cd20","content_len":10499,"word_count":1888,"cost":10,"lock":0},{"title":"Chapter 47: Adam","chapter_index":47,"uuid":"9e1cf0499472fa734ae36ab6d8f49d70","content_len":14688,"word_count":2503,"cost":13,"lock":0},{"title":"Chapter 48: Adam","chapter_index":48,"uuid":"f18333db3c52070129b0774497e033ac","content_len":15624,"word_count":2737,"cost":14,"lock":0},{"title":"Chapter 49: Adam","chapter_index":49,"uuid":"9cb4d56208853531b74b20127dc060b1","content_len":9020,"word_count":1587,"cost":8,"lock":0},{"title":"Chapter 50: Adam","chapter_index":50,"uuid":"2aa2f9e82875d0366fd4179b9d4d414f","content_len":13433,"word_count":2363,"cost":12,"lock":0},{"title":"Chapter 51: Felix","chapter_index":51,"uuid":"5663212a64f2d8946d0ae29a9de6a924","content_len":13317,"word_count":2308,"cost":12,"lock":0}]
     * charge_type : 0
     * trial_chapter : 20
     * title : Breaking Magic
     * cover : https://img.sg.goldenmob.com/img/b12af3b91283c2c57cd69aabdfd1a340/a9d79f2af6219c32b0d05ebb09d7fcb5-208.jpg
     * chapter_count : 52
     * author_name : J. Brenton Parker
     */

    private int charge_type;
    private String trial_chapter;
    private String title;
    private String cover;
    private String chapter_count;
    private String author_name;
    private List<ItemsBean> items;

    public int getCharge_type() {
        return charge_type;
    }

    public void setCharge_type(int charge_type) {
        this.charge_type = charge_type;
    }

    public String getTrial_chapter() {
        return trial_chapter;
    }

    public void setTrial_chapter(String trial_chapter) {
        this.trial_chapter = trial_chapter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getChapter_count() {
        return chapter_count;
    }

    public void setChapter_count(String chapter_count) {
        this.chapter_count = chapter_count;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {
        /**
         * title : Chapter 1: Adam
         * chapter_index : 1
         * uuid : 1910d444633d6b894cf25c4c82d6663f
         * content_len : 14435
         * word_count : 2623
         * cost : 14
         * lock : 0
         */

        private String title;
        private String chapter_index;
        private String uuid;
        private String content_len;
        private String word_count;
        private int cost;
        private int lock;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getChapter_index() {
            return chapter_index;
        }

        public void setChapter_index(String chapter_index) {
            this.chapter_index = chapter_index;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getContent_len() {
            return content_len;
        }

        public void setContent_len(String content_len) {
            this.content_len = content_len;
        }

        public String getWord_count() {
            return word_count;
        }

        public void setWord_count(String word_count) {
            this.word_count = word_count;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public int getLock() {
            return lock;
        }

        public void setLock(int lock) {
            this.lock = lock;
        }
    }
}

