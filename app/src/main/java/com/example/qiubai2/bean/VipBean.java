package com.example.qiubai2.bean;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Administrator on 2016/5/16 0016.
 */
public class VipBean {




    private int count;
    private int err;
    private int total;
    private int page;
    private int refresh;
    /**
     * high_url : http://qiubai-video.qiushibaike.com/29W6LVPTTY0G7PQV.mp4
     * format : video
     * image : null
     * published_at : 1463282702
     * tag : null
     * user : {"avatar_updated_at":1398521289,"uid":15875555,"last_visited_at":1398520911,"created_at":1398520911,"state":"bonding","last_device":"android_2.8","role":"n","login":"沉默者沉默着","id":15875555,"icon":"20140426220809.jpg"}
     * image_size : {"s":[480,480,9],"m":[480,480,9]}
     * id : 116348487
     * votes : {"down":-109,"up":4308}
     * created_at : 1463243251
     * pic_size : [480,480]
     * pic_url : http://qiubai-video.qiushibaike.com/29W6LVPTTY0G7PQV.jpg
     * content : “生活，不只眼前的苟且，还有诗和远方，瓜和瓜瓤，以及一张恰到好处的床”

     ——瓜中婴•人孩儿
     * state : publish
     * comments_count : 96
     * low_url : http://qiubai-video.qiushibaike.com/29W6LVPTTY0G7PQV_3g.mp4
     * allow_comment : true
     * share_count : 1384
     * type : hot
     * loop : 418461
     */

    private List<ItemsBean> items;
    /**
     * field : value
     */

    private String field;

    public static VipBean objectFromData(String str) {

        return new Gson().fromJson(str, VipBean.class);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getErr() {
        return err;
    }

    public void setErr(int err) {
        this.err = err;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRefresh() {
        return refresh;
    }

    public void setRefresh(int refresh) {
        this.refresh = refresh;
    }

    public  List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public static class ItemsBean {
        private String high_url;
        private String format;
        private Object image;
        private int published_at;
        private String tag;
        /**
         * avatar_updated_at : 1398521289
         * uid : 15875555
         * last_visited_at : 1398520911
         * created_at : 1398520911
         * state : bonding
         * last_device : android_2.8
         * role : n
         * login : 沉默者沉默着
         * id : 15875555
         * icon : 20140426220809.jpg
         */

        private UserBean user;
        private ImageSizeBean image_size;
        private int id;
        /**
         * down : -109
         * up : 4308
         */

        private VotesBean votes;
        private int created_at;
        private String pic_url;
        private String content;
        private String state;
        private int comments_count;
        private String low_url;
        private boolean allow_comment;
        private int share_count;
        private String type;
        private int loop;
        private List<Integer> pic_size;

        public static ItemsBean objectFromData(String str) {

            return new Gson().fromJson(str, ItemsBean.class);
        }

        public String getHigh_url() {
            return high_url;
        }

        public void setHigh_url(String high_url) {
            this.high_url = high_url;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public Object getImage() {
            return image;
        }

        public void setImage(Object image) {
            this.image = image;
        }

        public int getPublished_at() {
            return published_at;
        }

        public void setPublished_at(int published_at) {
            this.published_at = published_at;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public ImageSizeBean getImage_size() {
            return image_size;
        }

        public void setImage_size(ImageSizeBean image_size) {
            this.image_size = image_size;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public VotesBean getVotes() {
            return votes;
        }

        public void setVotes(VotesBean votes) {
            this.votes = votes;
        }

        public int getCreated_at() {
            return created_at;
        }

        public void setCreated_at(int created_at) {
            this.created_at = created_at;
        }

        public String getPic_url() {
            return pic_url;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getComments_count() {
            return comments_count;
        }

        public void setComments_count(int comments_count) {
            this.comments_count = comments_count;
        }

        public String getLow_url() {
            return low_url;
        }

        public void setLow_url(String low_url) {
            this.low_url = low_url;
        }

        public boolean isAllow_comment() {
            return allow_comment;
        }

        public void setAllow_comment(boolean allow_comment) {
            this.allow_comment = allow_comment;
        }

        public int getShare_count() {
            return share_count;
        }

        public void setShare_count(int share_count) {
            this.share_count = share_count;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getLoop() {
            return loop;
        }

        public void setLoop(int loop) {
            this.loop = loop;
        }

        public List<Integer> getPic_size() {
            return pic_size;
        }

        public void setPic_size(List<Integer> pic_size) {
            this.pic_size = pic_size;
        }

        public static class UserBean {
            private int avatar_updated_at;
            private int uid;
            private int last_visited_at;
            private int created_at;
            private String state;
            private String last_device;
            private String role;
            private String login;
            private int id;
            private String icon;

            public static UserBean objectFromData(String str) {

                return new Gson().fromJson(str, UserBean.class);
            }

            public int getAvatar_updated_at() {
                return avatar_updated_at;
            }

            public void setAvatar_updated_at(int avatar_updated_at) {
                this.avatar_updated_at = avatar_updated_at;
            }

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public int getLast_visited_at() {
                return last_visited_at;
            }

            public void setLast_visited_at(int last_visited_at) {
                this.last_visited_at = last_visited_at;
            }

            public int getCreated_at() {
                return created_at;
            }

            public void setCreated_at(int created_at) {
                this.created_at = created_at;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getLast_device() {
                return last_device;
            }

            public void setLast_device(String last_device) {
                this.last_device = last_device;
            }

            public String getRole() {
                return role;
            }

            public void setRole(String role) {
                this.role = role;
            }

            public String getLogin() {
                return login;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }

        public static class ImageSizeBean {
            private List<Integer> s;
            private List<Integer> m;

            public static ImageSizeBean objectFromData(String str) {

                return new Gson().fromJson(str, ImageSizeBean.class);
            }

            public List<Integer> getS() {
                return s;
            }

            public void setS(List<Integer> s) {
                this.s = s;
            }

            public List<Integer> getM() {
                return m;
            }

            public void setM(List<Integer> m) {
                this.m = m;
            }
        }

        public static class VotesBean {
            private int down;
            private int up;

            public static VotesBean objectFromData(String str) {

                return new Gson().fromJson(str, VotesBean.class);
            }

            public int getDown() {
                return down;
            }

            public void setDown(int down) {
                this.down = down;
            }

            public int getUp() {
                return up;
            }

            public void setUp(int up) {
                this.up = up;
            }
        }
    }
}

