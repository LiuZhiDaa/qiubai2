package com.example.qiubai2.nearby.presenter;


import com.example.qiubai2.bean.NearbyBean;
import com.example.qiubai2.constant.DataListener;
import com.example.qiubai2.nearby.model.IFindModel;
import com.example.qiubai2.nearby.model.IFindModelImpl;
import com.example.qiubai2.nearby.view.IFindView;

/**
 * Created by zzj on 2016/5/25.
 */
public class IFindPresenterImpl implements IFindPresenter,DataListener {
    IFindView iFindView;
    IFindModel iFindModel;

    public IFindPresenterImpl(IFindView iFindView){
        this.iFindView = iFindView;
        iFindModel = new IFindModelImpl();
    }
    @Override
    public void getFindPresenter() {
        iFindModel.getFindModel(this);
    }
    @Override
    public void onSuccess(Object o) {
        iFindView.initFind((NearbyBean) o);
    }

    @Override
    public void onError(Throwable throwable) {
        iFindView.showToast(throwable.getMessage());
    }


}
