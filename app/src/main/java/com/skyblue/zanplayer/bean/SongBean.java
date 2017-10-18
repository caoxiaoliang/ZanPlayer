package com.skyblue.zanplayer.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/10/11 0011.
 */

public class SongBean {

    private List<MItemsBean> mItems;

    public List<MItemsBean> getMItems() {
        return mItems;
    }

    public void setMItems(List<MItemsBean> mItems) {
        this.mItems = mItems;
    }

    public static class MItemsBean {
        /**
         * mAlbumId : 1913
         * mAlbumTitle : 把重担卸下来
         * mArtistId : 18
         * mAuthor : 颂赞创作诗歌
         * mLrcLink : http://api.zanmeishi.com/song/lrc/34966.lrc
         * mPicBig : http://file.zanmeishi.com/album/2017/09/19/59c07475694d2321dd3e17e2.jpg
         * mPicSmall : http://file.zanmeishi.com/album/2017/09/19/59c07475694d2321dd3e17e2.jpg
         * mSongCopyType : 1
         * mSongId : 34966
         * mTingUid : 18
         * mTitle : 祢是我一生最大的祝福
         * mHits : 18 万
         * mSongVideoId :
         * mNoDown : 1
         * mFileLink : http://api.zanmeishi.com/song/p/34966.mp3
         */

        private int mAlbumId;
        private String mAlbumTitle;
        private int mArtistId;
        private String mAuthor;
        private String mLrcLink;
        private String mPicBig;
        private String mPicSmall;
        private String mSongCopyType;
        private int mSongId;
        private int mTingUid;
        private String mTitle;
        private String mHits;
        private String mSongVideoId;
        private int mNoDown;
        private String mFileLink;

        public int getMAlbumId() {
            return mAlbumId;
        }

        public void setMAlbumId(int mAlbumId) {
            this.mAlbumId = mAlbumId;
        }

        public String getMAlbumTitle() {
            return mAlbumTitle;
        }

        public void setMAlbumTitle(String mAlbumTitle) {
            this.mAlbumTitle = mAlbumTitle;
        }

        public int getMArtistId() {
            return mArtistId;
        }

        public void setMArtistId(int mArtistId) {
            this.mArtistId = mArtistId;
        }

        public String getMAuthor() {
            return mAuthor;
        }

        public void setMAuthor(String mAuthor) {
            this.mAuthor = mAuthor;
        }

        public String getMLrcLink() {
            return mLrcLink;
        }

        public void setMLrcLink(String mLrcLink) {
            this.mLrcLink = mLrcLink;
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

        public String getMSongCopyType() {
            return mSongCopyType;
        }

        public void setMSongCopyType(String mSongCopyType) {
            this.mSongCopyType = mSongCopyType;
        }

        public int getMSongId() {
            return mSongId;
        }

        public void setMSongId(int mSongId) {
            this.mSongId = mSongId;
        }

        public int getMTingUid() {
            return mTingUid;
        }

        public void setMTingUid(int mTingUid) {
            this.mTingUid = mTingUid;
        }

        public String getMTitle() {
            return mTitle;
        }

        public void setMTitle(String mTitle) {
            this.mTitle = mTitle;
        }

        public String getMHits() {
            return mHits;
        }

        public void setMHits(String mHits) {
            this.mHits = mHits;
        }

        public String getMSongVideoId() {
            return mSongVideoId;
        }

        public void setMSongVideoId(String mSongVideoId) {
            this.mSongVideoId = mSongVideoId;
        }

        public int getMNoDown() {
            return mNoDown;
        }

        public void setMNoDown(int mNoDown) {
            this.mNoDown = mNoDown;
        }

        public String getMFileLink() {
            return mFileLink;
        }

        public void setMFileLink(String mFileLink) {
            this.mFileLink = mFileLink;
        }
    }
}
