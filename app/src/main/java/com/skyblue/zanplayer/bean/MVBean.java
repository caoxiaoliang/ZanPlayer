package com.skyblue.zanplayer.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/10/11 0011.
 */

public class MVBean {

    /**
     * mNum : 3840
     * mIsList : true
     * mItems : [
     * {"mVideoId":44,
     * "mTitle":"耶稣对我真好",
     * "mAuthor":"儿童诗歌",
     * "mPicBig":"http://file.zanmeishi.com/video/2016/06/01/574ea4728362dc37018b4726.jpg"},
     * {"mVideoId":46,"mTitle":"上帝能够","mAuthor":"儿童诗歌","mPicBig":"http://file.zanmeishi.com/video/2016/06/01/574eab4c8362dc92088b465b.jpg"},
     * {"mVideoId":295,"mTitle":"得胜组曲","mAuthor":"传神基金会","mPicBig":"http://file.zanmeishi.com/video/2016/06/19/5766b34d8362dc81218b496f.jpg"},
     * {"mVideoId":355,"mTitle":"心的归属（作者分享）","mAuthor":"新心音乐","mPicBig":"http://file.zanmeishi.com/video/2016/06/22/576a48fd8362dc873d8b45c7.jpg"},
     */

    private int mNum;
    private boolean mIsList;
    private List<MItemsBean> mItems;

    public int getMNum() {
        return mNum;
    }

    public void setMNum(int mNum) {
        this.mNum = mNum;
    }

    public boolean isMIsList() {
        return mIsList;
    }

    public void setMIsList(boolean mIsList) {
        this.mIsList = mIsList;
    }

    public List<MItemsBean> getMItems() {
        return mItems;
    }

    public void setMItems(List<MItemsBean> mItems) {
        this.mItems = mItems;
    }

    public static class MItemsBean {
        /**
         * mVideoId : 44
         * mTitle : 耶稣对我真好
         * mAuthor : 儿童诗歌
         * mPicBig : http://file.zanmeishi.com/video/2016/06/01/574ea4728362dc37018b4726.jpg
         */

        private int mVideoId;
        private String mTitle;
        private String mAuthor;
        private String mPicBig;

        public int getMVideoId() {
            return mVideoId;
        }

        public void setMVideoId(int mVideoId) {
            this.mVideoId = mVideoId;
        }

        public String getMTitle() {
            return mTitle;
        }

        public void setMTitle(String mTitle) {
            this.mTitle = mTitle;
        }

        public String getMAuthor() {
            return mAuthor;
        }

        public void setMAuthor(String mAuthor) {
            this.mAuthor = mAuthor;
        }

        public String getMPicBig() {
            return mPicBig;
        }

        public void setMPicBig(String mPicBig) {
            this.mPicBig = mPicBig;
        }
    }
}
