package com.example.qiubai2.bean;

import java.util.List;

/**
 * Created by 44744 on 2016/5/26.
 */
public class NearbyBean {

    /**
     * link : http://www.qiushibaike.com/
     * games : [{"link":"X9WO3A4I1Q","description":"屎上最懒游戏，首款魔兽题材放置RPG","name":"天天挂机","act":"启动","timestamp":1442995940,"image":"http://qiubai-cafe.qiniudn.com/FllgR-cxU0b8KGi5JunNpyAUR132","orientation":1},{"link":"610538921","description":"全球数百万玩家共同对战","name":"红警大战2","act":"启动","timestamp":1442908645,"image":"http://qiubai-cafe.qiniudn.com/FlZnmQy1OgAeLt4PYRw8RLu956lu","orientation":0}]
     * description : 精选好玩游戏，停不下来！
     * timestamp : 1442995940
     * show : 1
     */

    private GameBean game;
    /**
     * items : [{"price":100,"mktPrice":269900,"link":"http://www.wemart.cn/v2/weimao/index.html?shopId=shop001201501095297#gd/shop001201501095297/shop001201501095297/5083","image":"http://imgcache3.wemartimg.cn/shop001201501095297/201605/201005/26/159560","name":"【一元夺宝】格力1.5匹壁挂式变频家用冷暖空调 5月26日开奖 2699人次"},{"price":100,"mktPrice":199900,"link":"http://www.wemart.cn/v2/weimao/index.html?shopId=shop001201501095297#gd/shop001201501095297/shop001201501095297/5082","image":"http://imgcache5.wemartimg.cn/shop001201501095297/201605/191523/56/159254","name":"【一元夺宝】小米MAX智能手机 32G 金 5月26日开奖 1999人次"}]
     * show : 1
     */

    private BuyBean buy;
    /**
     * description : 糗事百科出品大综艺
     * videos : [{"timestamp":1463570701,"image":"http://static.qiushibaike.com/images/qvpage/v58.jpg?v=4432d2fa8d3ec7d3bb23ce9b1ce27261","link":"http://www.qiushibaike.com/topic","description":"万万想不到，《美队3》导演将打造\u201c中国队长\u201d！","subject":"第二季第二十八期"}]
     * show : 1
     * timestamp : 1463570701
     * link : http://www.qiushibaike.com/topic
     * name : 小鸡炖蘑菇
     */

    private VideoBean video;
    /**
     * game : {"link":"http://www.qiushibaike.com/","games":[{"link":"X9WO3A4I1Q","description":"屎上最懒游戏，首款魔兽题材放置RPG","name":"天天挂机","act":"启动","timestamp":1442995940,"image":"http://qiubai-cafe.qiniudn.com/FllgR-cxU0b8KGi5JunNpyAUR132","orientation":1},{"link":"610538921","description":"全球数百万玩家共同对战","name":"红警大战2","act":"启动","timestamp":1442908645,"image":"http://qiubai-cafe.qiniudn.com/FlZnmQy1OgAeLt4PYRw8RLu956lu","orientation":0}],"description":"精选好玩游戏，停不下来！","timestamp":1442995940,"show":1}
     * buy : {"items":[{"price":100,"mktPrice":269900,"link":"http://www.wemart.cn/v2/weimao/index.html?shopId=shop001201501095297#gd/shop001201501095297/shop001201501095297/5083","image":"http://imgcache3.wemartimg.cn/shop001201501095297/201605/201005/26/159560","name":"【一元夺宝】格力1.5匹壁挂式变频家用冷暖空调 5月26日开奖 2699人次"},{"price":100,"mktPrice":199900,"link":"http://www.wemart.cn/v2/weimao/index.html?shopId=shop001201501095297#gd/shop001201501095297/shop001201501095297/5082","image":"http://imgcache5.wemartimg.cn/shop001201501095297/201605/191523/56/159254","name":"【一元夺宝】小米MAX智能手机 32G 金 5月26日开奖 1999人次"}],"show":1}
     * video : {"description":"糗事百科出品大综艺","videos":[{"timestamp":1463570701,"image":"http://static.qiushibaike.com/images/qvpage/v58.jpg?v=4432d2fa8d3ec7d3bb23ce9b1ce27261","link":"http://www.qiushibaike.com/topic","description":"万万想不到，《美队3》导演将打造\u201c中国队长\u201d！","subject":"第二季第二十八期"}],"show":1,"timestamp":1463570701,"link":"http://www.qiushibaike.com/topic","name":"小鸡炖蘑菇"}
     * err : 0
     * timestamp : 1463570701
     * interval : 86400
     */

    private int err;
    private int timestamp;
    private int interval;

    public GameBean getGame() {
        return game;
    }

    public void setGame(GameBean game) {
        this.game = game;
    }

    public BuyBean getBuy() {
        return buy;
    }

    public void setBuy(BuyBean buy) {
        this.buy = buy;
    }

    public VideoBean getVideo() {
        return video;
    }

    public void setVideo(VideoBean video) {
        this.video = video;
    }

    public int getErr() {
        return err;
    }

    public void setErr(int err) {
        this.err = err;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public static class GameBean {
        private String link;
        private String description;
        private int timestamp;
        private int show;
        /**
         * link : X9WO3A4I1Q
         * description : 屎上最懒游戏，首款魔兽题材放置RPG
         * name : 天天挂机
         * act : 启动
         * timestamp : 1442995940
         * image : http://qiubai-cafe.qiniudn.com/FllgR-cxU0b8KGi5JunNpyAUR132
         * orientation : 1
         */

        private List<GamesBean> games;

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        public int getShow() {
            return show;
        }

        public void setShow(int show) {
            this.show = show;
        }

        public List<GamesBean> getGames() {
            return games;
        }

        public void setGames(List<GamesBean> games) {
            this.games = games;
        }

        public static class GamesBean {
            private String link;
            private String description;
            private String name;
            private String act;
            private int timestamp;
            private String image;
            private int orientation;

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAct() {
                return act;
            }

            public void setAct(String act) {
                this.act = act;
            }

            public int getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(int timestamp) {
                this.timestamp = timestamp;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getOrientation() {
                return orientation;
            }

            public void setOrientation(int orientation) {
                this.orientation = orientation;
            }
        }
    }

    public static class BuyBean {
        private int show;
        /**
         * price : 100
         * mktPrice : 269900
         * link : http://www.wemart.cn/v2/weimao/index.html?shopId=shop001201501095297#gd/shop001201501095297/shop001201501095297/5083
         * image : http://imgcache3.wemartimg.cn/shop001201501095297/201605/201005/26/159560
         * name : 【一元夺宝】格力1.5匹壁挂式变频家用冷暖空调 5月26日开奖 2699人次
         */

        private List<ItemsBean> items;

        public int getShow() {
            return show;
        }

        public void setShow(int show) {
            this.show = show;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            private int price;
            private int mktPrice;
            private String link;
            private String image;
            private String name;

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getMktPrice() {
                return mktPrice;
            }

            public void setMktPrice(int mktPrice) {
                this.mktPrice = mktPrice;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    public static class VideoBean {
        private String description;
        private int show;
        private int timestamp;
        private String link;
        private String name;
        /**
         * timestamp : 1463570701
         * image : http://static.qiushibaike.com/images/qvpage/v58.jpg?v=4432d2fa8d3ec7d3bb23ce9b1ce27261
         * link : http://www.qiushibaike.com/topic
         * description : 万万想不到，《美队3》导演将打造“中国队长”！
         * subject : 第二季第二十八期
         */

        private List<VideosBean> videos;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getShow() {
            return show;
        }

        public void setShow(int show) {
            this.show = show;
        }

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<VideosBean> getVideos() {
            return videos;
        }

        public void setVideos(List<VideosBean> videos) {
            this.videos = videos;
        }

        public static class VideosBean {
            private int timestamp;
            private String image;
            private String link;
            private String description;
            private String subject;

            public int getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(int timestamp) {
                this.timestamp = timestamp;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getSubject() {
                return subject;
            }

            public void setSubject(String subject) {
                this.subject = subject;
            }
        }
    }
}
