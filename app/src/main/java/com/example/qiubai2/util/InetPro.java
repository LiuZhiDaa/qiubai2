package com.example.qiubai2.util;




        import com.example.qiubai2.bean.LuncherBean;
        import com.example.qiubai2.bean.NearbyBean;
        import com.example.qiubai2.bean.ScandadetailsBean;
        import com.example.qiubai2.bean.VipBean;

        import retrofit.Call;
        import retrofit.http.GET;
        import retrofit.http.Path;
        import retrofit.http.Query;

/**
 * Created by Administrator on 2016/5/16 0016.
 */
public interface InetPro {
    /**
     * 启动页
     */
    @GET("/open/ad")
    Call<LuncherBean> getstart() ;
    /**
     * 糗事
     */
    @GET("/article/list/{url}")
    Call<VipBean> gethome(@Path("url") String url, @Query("page") String page, @Query("count") String count);

    /**发现*/
    @GET("found/info")
    Call<NearbyBean> getFound();

    /*
     * 评论
     */
    @GET("/article/{number}/comments")
    Call<ScandadetailsBean> getScandadetail(@Path("number")String number);

}

/**
 * 糗友圈
//     */
//    @GET("/article/{url}")
//    Call<FriendsBean> getfriend(@Path("url") String url,
//                                @Query("page") String page,
//                                @Query("latitude") String latitude,
//                                @Query("longitude") String longitude);


