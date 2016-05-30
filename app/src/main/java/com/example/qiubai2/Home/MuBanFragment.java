package com.example.qiubai2.Home;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.qiubai2.Home.Presenter.HomePresenter;
import com.example.qiubai2.Home.Presenter.HomePresenterImp;
import com.example.qiubai2.Home.View.HomeView;
import com.example.qiubai2.MainActivity;
import com.example.qiubai2.R;
import com.example.qiubai2.bean.ScandadetailsBean;
import com.example.qiubai2.bean.VipBean;
import com.example.qiubai2.details.ScandaldetailsActivity;
import com.example.qiubai2.util.RetrofitUtil;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MuBanFragment extends Fragment implements HomeView {
    View inflate;
    @Bind(R.id.vip_recyclerview)
    RecyclerView vipRecyclerview;
    VipAdapter mvipAdapter;
    HomePresenter mhomePresenter;
    Context context;

    String page = "1";
    String count = "20";
    @Bind(R.id.Swipe)
    SwipeRefreshLayout Swipe;
    private boolean refresh_flag = true;
    int i=1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        inflate = inflater.inflate(R.layout.fragment_mu_ban, container, false);

        ButterKnife.bind(this, inflate);
        Log.d("TAG", "ButterKnife");
        String id = getArguments().getString("id");
        //把自动初始化好的RecyclerView设置好布局
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(OrientationHelper.VERTICAL);
        vipRecyclerview.setLayoutManager(linearLayoutManager);
        mhomePresenter = new HomePresenterImp(this);
        mhomePresenter.gethomepresenter(id, page, count);


//        vipRecyclerview.setOnScrollListener(new RecyclerView.OnScrollListener() {
//            @Override
//            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
//                super.onScrollStateChanged(recyclerView, newState);
//                LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
//                //列表所有条目数
//                int totalItemsSize = layoutManager.getItemCount() - 1;//因为头部占了一个位置，但是并不属于新闻列表的范围内，
//                //当前屏幕中的条目数
//                int visibilityChildSize = layoutManager.getChildCount();
//                //当前屏幕中第一个条目位置
//                int visibilityChildPosition = layoutManager.findFirstVisibleItemPosition();
//                //判断是否到列表底部，如果到底部，则执行方法体内的内容
//
//                if (visibilityChildPosition + visibilityChildSize >= totalItemsSize) {
//                    if (refresh_flag) {
//                        refresh_flag = false;
//                        Toast.makeText(getActivity(), "到底了", Toast.LENGTH_SHORT).show();
//                        mhomePresenter.gethomepresenter(RetrofitUtil.timeCalendarToString(i++),page,count);//获取总数目减一的数据的id，传给主持层的方法，以便回调View层的接口方法
//
//                    }
//                }
//
//            }
//
//            @Override
//            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
//                super.onScrolled(recyclerView, dx, dy);
//            }
//        });
//        Swipe.setOnRefreshListener((SwipeRefreshLayout.OnRefreshListener) this);
        return inflate;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        context = activity;
    }


    @Override
    public void gethomeview(VipBean vipBean) {
        if (vipBean != null) {
            mvipAdapter = new VipAdapter(context, vipBean.getItems());
            Log.d("TAG", vipRecyclerview.toString());
            vipRecyclerview.setLayoutManager(new LinearLayoutManager(context));
            vipRecyclerview.setAdapter(mvipAdapter);
            mvipAdapter.setOnItemClickListener(new VipAdapter.OnClickListener() {
                @Override
                public void OnClickListener(int itemData, List<VipBean.ItemsBean> item) {
                    Bundle bundle = new Bundle();
                    bundle.putString("id", String.valueOf(item.get(itemData).getId()));
                    bundle.putString("icon",item.get(itemData).getUser().getIcon());
                    bundle.putString("name",item.get(itemData).getUser().getLogin());
                    bundle.putString("iconid", String.valueOf(item.get(itemData).getUser().getId()));
                    bundle.putString("content",item.get(itemData).getContent());
                    bundle.putString("imageid", String.valueOf(item.get(itemData).getId()));
                    bundle.putString("image", (String) item.get(itemData).getImage());

                    bundle.putString("hot",item.get(itemData).getType());

                    bundle.putString("like", String.valueOf(item.get(itemData).getVotes().getUp()));
                    bundle.putString("count", String.valueOf(item.get(itemData).getComments_count()));
                    bundle.putString("share", String.valueOf(item.get(itemData).getShare_count()));
                    Intent intent = new Intent(getActivity(),ScandaldetailsActivity.class);

                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
        }
//        refresh_flag = true;
//        Swipe.setRefreshing(false);//停止刷新动画
    }

    @Override
    public void showToas(CharSequence msg) {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
        Log.d("TAG", "onDestroyView");

    }
}
