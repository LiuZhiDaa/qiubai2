package com.example.qiubai2.details;


import com.example.qiubai2.bean.ScandadetailsBean;
import com.example.qiubai2.constant.DataListener;
import com.example.qiubai2.util.RetrofitUtil;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by john on 2016/5/25.
 */
public class ScandaldetailsModelimpl implements ScandaldetailsModel {
    @Override
    public void getScandaldetails(String number, final DataListener dataListener2) {
        RetrofitUtil.initDate().getScandadetail(number).enqueue(new Callback<ScandadetailsBean>() {
            @Override
            public void onResponse(Response<ScandadetailsBean> response, Retrofit retrofit) {
                dataListener2.onSuccess(response.body());
            }

            @Override
            public void onFailure(Throwable t) {
                dataListener2.onError(t);
            }
        });
    }
}
