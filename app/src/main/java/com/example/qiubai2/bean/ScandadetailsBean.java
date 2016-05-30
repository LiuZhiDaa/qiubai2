package com.example.qiubai2.bean;

import com.google.gson.Gson;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by john on 2016/5/23.
 */
public class ScandadetailsBean {
    /**
     * count : 20
     * items : [{"content":"只能说一对奇葩","parent_id":0,"liked":false,"like_count":26,"at_infos":{},"floor":2,"created_at":1463013606,"id":356949487,"user":{"last_visited_at":1377908577,"created_at":1377908577,"last_device":"android_2.5.3.2","state":"active","role":"n","login":"小时候，可白了","id":11000283,"icon":"20140516152146.jpg"}},{"content":"点赞吧  没啥说的","parent_id":0,"liked":false,"like_count":9,"at_infos":{},"floor":3,"created_at":1463015146,"id":356951312,"user":{"last_visited_at":1418023883,"created_at":1418023883,"last_device":"android_4.0.0","state":"active","role":"n","login":"万恶的老龙","id":23578311,"icon":"20141208153123.jpg"}},{"content":"成了光皮蛋了","parent_id":0,"liked":false,"like_count":13,"at_infos":{},"floor":4,"created_at":1463016726,"id":356953198,"user":{"last_visited_at":1377943063,"created_at":1377943063,"last_device":"web","state":"bonded","role":"n","login":"范斌斌","id":11008292,"icon":"20150523221456.jpg"}},{"content":"好玩！！！","parent_id":0,"liked":false,"like_count":4,"at_infos":{},"floor":5,"created_at":1463017832,"id":356954432,"user":{"last_visited_at":1416406675,"created_at":1416406675,"last_device":"android_3.4.2","state":"active","role":"n","login":"你是疯了我是傻","id":22878101,"icon":"20160521085712.jpg"}},{"content":"光得眉毛？\u2026\u2026","parent_id":0,"liked":false,"like_count":0,"at_infos":{},"floor":6,"created_at":1463019695,"id":356956664,"user":{"last_visited_at":1411973783,"created_at":1411973783,"last_device":"android_3.2.1","state":"active","role":"n","login":"以后滴以前","id":21167691,"icon":"20160429154400.jpg"}},{"content":"这个好笑","parent_id":0,"liked":false,"like_count":4,"at_infos":{},"floor":7,"created_at":1463021768,"id":356958988,"user":{"last_visited_at":1351429358,"created_at":1351429358,"last_device":"web","state":"bonded","role":"n","login":"亲爱的你.","id":4336727,"icon":"20160108224259.jpg"}},{"content":"路过点赞","parent_id":0,"liked":false,"like_count":3,"at_infos":{},"floor":8,"created_at":1463022281,"id":356959571,"user":{"last_visited_at":1457116926,"created_at":1457116926,"last_device":"android_9.1.2","state":"active","role":"n","login":"誓言只是两个字","id":31332416,"icon":"20160513012400.jpg"}},{"content":"没图你说个J巴","parent_id":0,"liked":false,"like_count":3,"at_infos":{},"floor":9,"created_at":1463022528,"id":356959846,"user":{"last_visited_at":1396257236,"created_at":1396257236,"last_device":"android_2.8.1","state":"active","role":"n","login":"fly1977","id":15203770,"icon":"20140331171857.jpg"}},{"content":"还白","parent_id":0,"liked":false,"like_count":0,"at_infos":{},"floor":10,"created_at":1463022680,"id":356959981,"user":{"last_visited_at":1404719864,"created_at":1404719864,"last_device":"web","state":"pending","role":"n","login":"戴度数的太阳镜","id":17633285,"icon":"20160512111156.jpg"}},{"content":"下面也刮了","parent_id":0,"liked":false,"like_count":6,"at_infos":{},"floor":11,"created_at":1463023368,"id":356960711,"user":{"last_visited_at":1431678726,"created_at":1431678726,"last_device":"android_6.7.1","state":"active","role":"n","login":"一起飞舞的曰子","id":28430270,"icon":"20150515163206.jpg"}},{"content":"长毛的都刮了","parent_id":0,"liked":false,"like_count":1,"at_infos":{},"floor":12,"created_at":1463023620,"id":356961026,"user":{"last_visited_at":1428727794,"created_at":1428727794,"last_device":"ios_6.5.2","state":"active","role":"n","login":"新手不潜","id":27501426,"icon":"20160503001751.jpg"}},{"content":"这是在秀恩爱","parent_id":0,"liked":false,"like_count":4,"at_infos":{},"floor":13,"created_at":1463024285,"id":356961782,"user":{"last_visited_at":1459670940,"created_at":1459670940,"last_device":"android_9.3.2","state":"active","role":"n","login":"零下1°度","id":31534553,"icon":"20160403080900.jpg"}},{"content":"不作死不死","parent_id":0,"liked":false,"like_count":1,"at_infos":{},"floor":14,"created_at":1463024549,"id":356962117,"user":{"last_visited_at":1447709650,"created_at":1447709650,"last_device":"android_8.3.3","state":"active","role":"n","login":"四爷家的妞","id":30630122,"icon":"20160424102520.jpg"}},{"content":"刘海遮住","parent_id":0,"liked":false,"like_count":1,"at_infos":{},"floor":15,"created_at":1463024569,"id":356962141,"user":{"last_visited_at":1454454794,"created_at":1454454794,"last_device":"android_9.1.0","state":"active","role":"n","login":"沉睡中的梦","id":31101026,"icon":"20160501235247.jpg"}},{"content":"哈哈，好可爱的一对","parent_id":0,"liked":false,"like_count":2,"at_infos":{},"floor":16,"created_at":1463024802,"id":356962394,"user":{"last_visited_at":1429286344,"created_at":1429286344,"last_device":"ios_6.5.2","state":"active","role":"n","login":"从未觅得良人、","id":27700986,"icon":"20160202004102.jpg"}},{"content":"分享该糗事到糗友圈","parent_id":0,"liked":false,"like_count":0,"at_infos":{},"floor":17,"created_at":1463025058,"id":356962731,"user":{"last_visited_at":1354697048,"created_at":1354697048,"last_device":"ios_2.1","state":"active","role":"n","login":"记忆中最想抹去","id":4916969,"icon":"20160501092855.jpg"}},{"content":"这个真笑了","parent_id":0,"liked":false,"like_count":1,"at_infos":{},"floor":18,"created_at":1463025516,"id":356963331,"user":{"last_visited_at":1403272355,"created_at":1403272355,"last_device":"android_3.0.1","state":"active","role":"n","login":"壹路花开","id":17084539,"icon":"20150902162047.jpg"}},{"content":"有种东西叫眉笔","parent_id":0,"liked":false,"like_count":0,"at_infos":{},"floor":19,"created_at":1463025525,"id":356963341,"user":{"last_visited_at":1430321088,"created_at":1430321088,"last_device":"android_6.6.0","state":"active","role":"n","login":"河豚儿","id":28031678,"icon":"20160517134620.jpg"}},{"content":"还没离婚也是人才","parent_id":0,"liked":false,"like_count":0,"at_infos":{},"floor":20,"created_at":1463025705,"id":356963578,"user":{"last_visited_at":1391681593,"created_at":1391681593,"last_device":"android_2.6.3","state":"active","role":"n","login":"你好纯洁啊","id":13979781,"icon":"20151224125601.jpg"}}]
     * total : 239
     * page : 1
     * err : 0
     */

    private int count;
    private int total;
    private int page;
    private int err;
    /**
     * content : 只能说一对奇葩
     * parent_id : 0
     * liked : false
     * like_count : 26
     * at_infos : {}
     * floor : 2
     * created_at : 1463013606
     * id : 356949487
     * user : {"last_visited_at":1377908577,"created_at":1377908577,"last_device":"android_2.5.3.2","state":"active","role":"n","login":"小时候，可白了","id":11000283,"icon":"20140516152146.jpg"}
     */

    private List<ItemsBean> items;

    public static ScandadetailsBean objectFromData(String str) {

        return new Gson().fromJson(str, ScandadetailsBean.class);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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

    public int getErr() {
        return err;
    }

    public void setErr(int err) {
        this.err = err;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {
        private String content;
        private int parent_id;
        private boolean liked;
        private int like_count;
        private int floor;
        private int created_at;
        private int id;
        /**
         * last_visited_at : 1377908577
         * created_at : 1377908577
         * last_device : android_2.5.3.2
         * state : active
         * role : n
         * login : 小时候，可白了
         * id : 11000283
         * icon : 20140516152146.jpg
         */

        private UserBean user;

        public static ItemsBean objectFromData(String str) {

            return new Gson().fromJson(str, ItemsBean.class);
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getParent_id() {
            return parent_id;
        }

        public void setParent_id(int parent_id) {
            this.parent_id = parent_id;
        }

        public boolean isLiked() {
            return liked;
        }

        public void setLiked(boolean liked) {
            this.liked = liked;
        }

        public int getLike_count() {
            return like_count;
        }

        public void setLike_count(int like_count) {
            this.like_count = like_count;
        }

        public int getFloor() {
            return floor;
        }

        public void setFloor(int floor) {
            this.floor = floor;
        }

        public int getCreated_at() {
            return created_at;
        }

        public void setCreated_at(int created_at) {
            this.created_at = created_at;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }




        public static class UserBean {
            private int last_visited_at;
            private int created_at;
            private String last_device;
            private String state;
            private String role;
            private String login;
            private int id;
            private String icon;

            public static UserBean objectFromData(String str) {

                return new Gson().fromJson(str, UserBean.class);
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

            public String getLast_device() {
                return last_device;
            }

            public void setLast_device(String last_device) {
                this.last_device = last_device;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
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
    }
}
