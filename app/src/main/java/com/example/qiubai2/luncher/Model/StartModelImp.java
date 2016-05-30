package com.example.qiubai2.luncher.Model;



import com.example.qiubai2.bean.LuncherBean;
import com.example.qiubai2.constant.DataListener;
import com.example.qiubai2.util.RetrofitUtil;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by Administrator on 2016/5/16 0016.
 */
public class StartModelImp implements StartModel {


    @Override
    public void getstartmodel(final DataListener dateCallback) {
        RetrofitUtil.initDate().getstart().enqueue(new Callback<LuncherBean>() {
            @Override
            public void onResponse(Response<LuncherBean> response, Retrofit retrofit) {
                dateCallback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Throwable t) {
                dateCallback.onSuccess(t);
            }
        });
    }
}
