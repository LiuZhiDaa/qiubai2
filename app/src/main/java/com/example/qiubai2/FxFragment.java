package com.example.qiubai2;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qiubai2.adapter.MyNearbyAdapter;
import com.example.qiubai2.bean.NearbyBean;
import com.example.qiubai2.nearby.presenter.IFindPresenterImpl;
import com.example.qiubai2.nearby.view.IFindView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by 44744 on 2016/5/17.
 */
public class FxFragment extends Fragment implements IFindView {
    @Bind(R.id.rv_find)
    RecyclerView rvFind;
    private MyNearbyAdapter myNearbyAdapter;
    private Context context;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_content_faxian, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        IFindPresenterImpl iFindPresenter = new IFindPresenterImpl(this);
        iFindPresenter.getFindPresenter();

    }

    /**
     * 初始化context
     */
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.context = activity;
    }

    @Override
    public void initFind(NearbyBean findEntity) {
        Log.i("lhd", "initFind: "+findEntity.getTimestamp());
        rvFind.setLayoutManager(new LinearLayoutManager(this.getContext()));
        myNearbyAdapter = new MyNearbyAdapter(this.getContext(), findEntity);
        rvFind.setAdapter(myNearbyAdapter);
    }

    @Override
    public void showToast(CharSequence msg) {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
