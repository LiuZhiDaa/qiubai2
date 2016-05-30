package com.example.qiubai2.nearby.model;


import com.example.qiubai2.bean.NearbyBean;
import com.example.qiubai2.constant.DataListener;
import com.example.qiubai2.util.RetrofitUtil;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by zzj on 2016/5/25.
 */
public class IFindModelImpl implements IFindModel {


    @Override
    public void getFindModel(final DataListener dataListener) {
        RetrofitUtil.initDates().getFound().enqueue(new Callback<NearbyBean>() {
            @Override
            public void onResponse(Response<NearbyBean> response, Retrofit retrofit) {
                dataListener.onSuccess(response.body());
            }

            @Override
            public void onFailure(Throwable t) {
                dataListener.onError(t);

            }
        });
    }
}
