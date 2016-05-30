package com.example.qiubai2.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by lc on 2016/4/14.
 */
public class RetrofitUtil {

    private static Retrofit retrofit;
    private static InetPro inetPro;
    private static Date LastDay;

    public static InetPro initDate() {
        retrofit = new Retrofit.Builder()
                .baseUrl(" http://m2.qiushibaike.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        inetPro = retrofit.create(InetPro.class);
        return inetPro;

    }

    public static InetPro initDates() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://circle.qiushibaike.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        inetPro = retrofit.create(InetPro.class);
        return inetPro;
    }

}
