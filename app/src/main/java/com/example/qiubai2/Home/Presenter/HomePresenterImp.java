package com.example.qiubai2.Home.Presenter;

import android.content.Context;

import com.example.qiubai2.Home.Model.HomeModel;
import com.example.qiubai2.Home.Model.HomeModelImp;
import com.example.qiubai2.Home.View.HomeView;
import com.example.qiubai2.bean.VipBean;
import com.example.qiubai2.constant.DataListener;


/**
 * Created by Administrator on 2016/5/16 0016.
 */
public class HomePresenterImp implements HomePresenter,DataListener {

    HomeView homeView;
    HomeModel homeModel;


    public HomePresenterImp(HomeView homeView){
        this.homeView = homeView;

        homeModel = new HomeModelImp();
    }



    @Override
    public void onSuccess(Object o) {
        homeView.gethomeview((VipBean) o);
    }

    @Override
    public void onError(Throwable throwable) {
        homeView.showToas(throwable.getMessage());
    }


    @Override
    public void gethomepresenter(String day , String page , String count) {
        homeModel.gethomemodel(day,page,count,this);
    }
}
