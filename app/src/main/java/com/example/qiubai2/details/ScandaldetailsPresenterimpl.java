package com.example.qiubai2.details;

import com.example.qiubai2.bean.ScandadetailsBean;
import com.example.qiubai2.constant.DataListener;

/**
 * Created by john on 2016/5/25.
 */
public class ScandaldetailsPresenterimpl implements ScandaldetailsPresenter ,DataListener{
    ScandaldetailsModel scandaldetailsModel;
    ScandaldetailsView scandaldetailsView;

    public ScandaldetailsPresenterimpl(ScandaldetailsView scandaldetailsView){
        this.scandaldetailsView = scandaldetailsView;
        scandaldetailsModel = new ScandaldetailsModelimpl();
    }
    @Override
    public void onSuccess(Object o) {
        scandaldetailsView.initScandaldetailsView((ScandadetailsBean)o);
    }

    @Override
    public void onError(Throwable throwable) {
        scandaldetailsView.showToast(throwable.getMessage());
    }


    @Override
    public void getScandaldetails(String number) {
        scandaldetailsModel.getScandaldetails(number,this);
    }
}

