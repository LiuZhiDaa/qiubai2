package com.example.qiubai2.luncher.Present;


import com.example.qiubai2.bean.LuncherBean;
import com.example.qiubai2.constant.DataListener;
import com.example.qiubai2.luncher.Model.StartModel;
import com.example.qiubai2.luncher.Model.StartModelImp;
import com.example.qiubai2.luncher.View.StartView;

/**
 * Created by Administrator on 2016/5/16 0016.
 */
public class StartPresenterImp implements StartPresenter,DataListener {

    StartView startView;
    StartModel startModel;

    public StartPresenterImp(StartView startView){
        this.startView = startView;
        startModel = new StartModelImp();
    }

    @Override
    public void onSuccess(Object o) {
        startView.startView((LuncherBean) o);
    }

    @Override
    public void onError(Throwable throwable) {
        startView.showToas(throwable.getMessage());
    }
    @Override
    public void getstartpresenter() {
        startModel.getstartmodel(this);
    }
}
