package com.skyblue.zanplayer.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/10/11 0011.
 */

public class AlbumBean {

    private List<MItemsBean> mItems;

    public List<MItemsBean> getMItems() {
        return mItems;
    }

    public void setMItems(List<MItemsBean> mItems) {
        this.mItems = mItems;
    }

    public static class MItemsBean {
        /**
         * mTitle : 不在祢以外
         * mAlbumId : 1920
         * mArtistId : 18
         * mArtistTingUid : 18
         * mAuthor : 颂赞创作诗歌
         * mPublishTime : 2017-10-08
         * mPicBig : http://file.zanmeishi.com/album/2017/10/08/59d950b2694d2373ba7cd696.jpg
         * mPicSmall : http://file.zanmeishi.com/album/2017/10/08/59d950b2694d2373ba7cd696.jpg
         * mSongsTotal : 13
         * mInfo : 这张专辑来自咏生敬拜团，带领这支团队的马振龙弟兄 (Paul Niednagel) 有20多年敬拜主领的丰富经验，包含跟赞美之泉、磐石乐团等团队的配搭。他的负担是帮助基督徒用歌声唱出生命，用生命唱出敬拜，结合诗歌、经文、祷告和弟兄姐妹彼此的互动来更认识神而带出一个反映神荣光的生命。从美国印第安那州飘洋过海，跨文化的语言学习从零开始到如今，马振龙说得一口流利的国语，写得一手中文好歌词，对他来说，这一切是因为神选择用不配的瓦器承接了祂的宝藏，证明能力是来自于祂而不是出自于人（林后四：7）。马振龙说：「也就因为我们的神是这么的奇妙，而使的我更想要用我的一切来敬拜赞美祂。」
         * mUrl : http://www.zanmeishi.com/album/in-you-alone.html
         */

        private String mTitle;
        private int mAlbumId;
        private int mArtistId;
        private int mArtistTingUid;
        private String mAuthor;
        private String mPublishTime;
        private String mPicBig;
        private String mPicSmall;
        private int mSongsTotal;
        private String mInfo;
        private String mUrl;

        public String getMTitle() {
            return mTitle;
        }

        public void setMTitle(String mTitle) {
            this.mTitle = mTitle;
        }

        public int getMAlbumId() {
            return mAlbumId;
        }

        public void setMAlbumId(int mAlbumId) {
            this.mAlbumId = mAlbumId;
        }

        public int getMArtistId() {
            return mArtistId;
        }

        public void setMArtistId(int mArtistId) {
            this.mArtistId = mArtistId;
        }

        public int getMArtistTingUid() {
            return mArtistTingUid;
        }

        public void setMArtistTingUid(int mArtistTingUid) {
            this.mArtistTingUid = mArtistTingUid;
        }

        public String getMAuthor() {
            return mAuthor;
        }

        public void setMAuthor(String mAuthor) {
            this.mAuthor = mAuthor;
        }

        public String getMPublishTime() {
            return mPublishTime;
        }

        public void setMPublishTime(String mPublishTime) {
            this.mPublishTime = mPublishTime;
        }

        public String getMPicBig() {
            return mPicBig;
        }

        public void setMPicBig(String mPicBig) {
            this.mPicBig = mPicBig;
        }

        public String getMPicSmall() {
            return mPicSmall;
        }

        public void setMPicSmall(String mPicSmall) {
            this.mPicSmall = mPicSmall;
        }

        public int getMSongsTotal() {
            return mSongsTotal;
        }

        public void setMSongsTotal(int mSongsTotal) {
            this.mSongsTotal = mSongsTotal;
        }

        public String getMInfo() {
            return mInfo;
        }

        public void setMInfo(String mInfo) {
            this.mInfo = mInfo;
        }

        public String getMUrl() {
            return mUrl;
        }

        public void setMUrl(String mUrl) {
            this.mUrl = mUrl;
        }
    }
}
