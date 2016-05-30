package com.example.qiubai2.bean;

import java.util.List;

/**
 * Created by 44744 on 2016/5/20.
 */
public class LuncherBean {
    /**
     * items : [{"ad_id":73,"weight":30,"need_share":0,"interval":600,"web_info_android":"null","topic_info":4592,"start_date":1461296400,"delay":3,"redirect_type":"topic","end_date":1461382800,"type":"openad","pic_url":"http://circle-pic.qiushibaike.com/FrOYVgAXve535uYhQj4jXHbgh0no?imageView2/2/w/500/q/80","web_info":"null"}]
     * err : 0
     * version_id : 94
     */

    private int err;
    private int version_id;
    /**
     * ad_id : 73
     * weight : 30
     * need_share : 0
     * interval : 600
     * web_info_android : null
     * topic_info : 4592
     * start_date : 1461296400
     * delay : 3
     * redirect_type : topic
     * end_date : 1461382800
     * type : openad
     * pic_url : http://circle-pic.qiushibaike.com/FrOYVgAXve535uYhQj4jXHbgh0no?imageView2/2/w/500/q/80
     * web_info : null
     */

    private List<ItemsBean> items;

    public int getErr() {
        return err;
    }

    public void setErr(int err) {
        this.err = err;
    }

    public int getVersion_id() {
        return version_id;
    }

    public void setVersion_id(int version_id) {
        this.version_id = version_id;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {
        private int ad_id;
        private int weight;
        private int need_share;
        private int interval;
        private String web_info_android;
        private int topic_info;
        private int start_date;
        private int delay;
        private String redirect_type;
        private int end_date;
        private String type;
        private String pic_url;
        private String web_info;

        public int getAd_id() {
            return ad_id;
        }

        public void setAd_id(int ad_id) {
            this.ad_id = ad_id;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getNeed_share() {
            return need_share;
        }

        public void setNeed_share(int need_share) {
            this.need_share = need_share;
        }

        public int getInterval() {
            return interval;
        }

        public void setInterval(int interval) {
            this.interval = interval;
        }

        public String getWeb_info_android() {
            return web_info_android;
        }

        public void setWeb_info_android(String web_info_android) {
            this.web_info_android = web_info_android;
        }

        public int getTopic_info() {
            return topic_info;
        }

        public void setTopic_info(int topic_info) {
            this.topic_info = topic_info;
        }

        public int getStart_date() {
            return start_date;
        }

        public void setStart_date(int start_date) {
            this.start_date = start_date;
        }

        public int getDelay() {
            return delay;
        }

        public void setDelay(int delay) {
            this.delay = delay;
        }

        public String getRedirect_type() {
            return redirect_type;
        }

        public void setRedirect_type(String redirect_type) {
            this.redirect_type = redirect_type;
        }

        public int getEnd_date() {
            return end_date;
        }

        public void setEnd_date(int end_date) {
            this.end_date = end_date;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getPic_url() {
            return pic_url;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public String getWeb_info() {
            return web_info;
        }

        public void setWeb_info(String web_info) {
            this.web_info = web_info;
        }
    }
}
