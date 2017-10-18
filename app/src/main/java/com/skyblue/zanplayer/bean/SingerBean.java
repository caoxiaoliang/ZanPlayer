package com.skyblue.zanplayer.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/10/11 0011.
 */

public class SingerBean {

    /**
     * mIsList : true
     * mNum : 12
     * mItems : [{"mTingUid":11,"mName":"天韵合唱团","mAlbumTotal":29,"mSongsTotal":354,"mInfo":"天韵，台湾第一个全职专业的音乐事奉团队。天韵的目标是透过音乐宣扬上帝的爱，藉着音乐创作、制作、现场音乐会，把生命的价值和天国的福音带到人心。","mUrl":"http://www.zanmeishi.com/artist/heavenly-melody.html","mAvatarSmall":"http://file.zanmeishi.com/artist/2008/02/22/5162d1487d4c500788487cb9.jpg"},
     * {"mTingUid":71,"mName":"生命河灵粮堂","mAlbumTotal":8,"mSongsTotal":111,"mInfo":"矽谷生命河灵粮堂，由刘彤牧师于1995年率领成立，积极在廿一世纪建立神荣耀的教会。","mUrl":"http://www.zanmeishi.com/artist/rolcc.html","mAvatarSmall":"http://file.zanmeishi.com/artist/2008/03/12/5162d1497d4c500788487ce0.jpg"},{"mTingUid":5,"mName":"有情天音乐","mAlbumTotal":17,"mSongsTotal":217,"mInfo":"有情天音乐股份有限公司（有情天音乐世界）初期由陈逸豪牧师及一群对宣教有负担的弟兄姊妹，同心组成理事会，于民国八十七年在美国加州成立，是一个非营利福音性机构。","mUrl":"http://www.zanmeishi.com/artist/heaventunes.html","mAvatarSmall":"http://file.zanmeishi.com/artist/2008/02/22/5162d1477d4c500788487cb3.jpg"},
     */

    private boolean mIsList;
    private int mNum;
    private List<MItemsBean> mItems;

    public boolean isMIsList() {
        return mIsList;
    }

    public void setMIsList(boolean mIsList) {
        this.mIsList = mIsList;
    }

    public int getMNum() {
        return mNum;
    }

    public void setMNum(int mNum) {
        this.mNum = mNum;
    }

    public List<MItemsBean> getMItems() {
        return mItems;
    }

    public void setMItems(List<MItemsBean> mItems) {
        this.mItems = mItems;
    }

    public static class MItemsBean {
        /**
         * mTingUid : 11
         * mName : 天韵合唱团
         * mAlbumTotal : 29
         * mSongsTotal : 354
         * mInfo : 天韵，台湾第一个全职专业的音乐事奉团队。天韵的目标是透过音乐宣扬上帝的爱，藉着音乐创作、制作、现场音乐会，把生命的价值和天国的福音带到人心。
         * mUrl : http://www.zanmeishi.com/artist/heavenly-melody.html
         * mAvatarSmall : http://file.zanmeishi.com/artist/2008/02/22/5162d1487d4c500788487cb9.jpg
         */

        private int mTingUid;
        private String mName;
        private int mAlbumTotal;
        private int mSongsTotal;
        private String mInfo;
        private String mUrl;
        private String mAvatarSmall;

        public int getMTingUid() {
            return mTingUid;
        }

        public void setMTingUid(int mTingUid) {
            this.mTingUid = mTingUid;
        }

        public String getMName() {
            return mName;
        }

        public void setMName(String mName) {
            this.mName = mName;
        }

        public int getMAlbumTotal() {
            return mAlbumTotal;
        }

        public void setMAlbumTotal(int mAlbumTotal) {
            this.mAlbumTotal = mAlbumTotal;
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

        public String getMAvatarSmall() {
            return mAvatarSmall;
        }

        public void setMAvatarSmall(String mAvatarSmall) {
            this.mAvatarSmall = mAvatarSmall;
        }
    }
}
