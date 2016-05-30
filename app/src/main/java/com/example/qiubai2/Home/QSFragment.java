package com.example.qiubai2.Home;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qiubai2.R;
import com.example.qiubai2.adapter.QsClassifyAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by 44744 on 2016/5/17.
 */
public class QSFragment extends Fragment {
    List<Fragment> list;
    QsClassifyAdapter qsClassifyAdapter;
    @Bind(R.id.qstablayout)
    TabLayout qstablayout;
    @Bind(R.id.qsviewPager)
    ViewPager qsviewPager;
    private String[] tabs = new String[]{"专享", "视频", "纯文", "纯图", "精华"};
    private String[] url = new String[]{"day", "video", "text", "imgrank", "latest"};


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_content, container, false);
        ButterKnife.bind(this, view);
        initView();
        return view;
    }

    private void initView() {
        list = new ArrayList<>();
        for (int i = 0; i < tabs.length; i++) {
            MuBanFragment qsClassifyFragment = new MuBanFragment();
            Bundle bundle=new Bundle();
            bundle.putString("id",url[i]);
            qsClassifyFragment.setArguments(bundle);
            list.add(qsClassifyFragment);
        }
        qsClassifyAdapter = new QsClassifyAdapter(getChildFragmentManager(), list);
        qsviewPager.setAdapter(qsClassifyAdapter);
        qstablayout.setupWithViewPager(qsviewPager);
        for (int i = 0; i < qstablayout.getTabCount(); i++) {
            qstablayout.getTabAt(i).setText(tabs[i]);
        }

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
