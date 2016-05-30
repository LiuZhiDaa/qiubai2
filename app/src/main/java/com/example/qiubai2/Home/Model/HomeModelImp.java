package com.example.qiubai2.Home.Model;

import android.util.Log;

import com.example.qiubai2.bean.VipBean;
import com.example.qiubai2.constant.DataListener;
import com.example.qiubai2.util.RetrofitUtil;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by Administrator on 2016/5/16 0016.
 */
public class HomeModelImp implements HomeModel {


    @Override
    public void gethomemodel(String day,String page, String count,final DataListener dataListener) {
        RetrofitUtil.initDate().gethome(day,page,count).enqueue(new Callback<VipBean>() {
            @Override
            public void onResponse(Response<VipBean> response, Retrofit retrofit) {
                VipBean vipBean = response.body();
                Log.d("0900",""+response.body());
                dataListener.onSuccess(vipBean);
            }

            @Override
            public void onFailure(Throwable t) {
                dataListener.onError(t);
            }
        });
    }
}
