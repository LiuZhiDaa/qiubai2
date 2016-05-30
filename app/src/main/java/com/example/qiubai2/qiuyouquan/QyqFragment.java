package com.example.qiubai2.qiuyouquan;


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
public class QyqFragment extends Fragment {
    List<Fragment> listFragments;
    QsClassifyAdapter qsClassifyAdapter;
    @Bind(R.id.qyqtablayout)
    TabLayout qyqtablayout;
    @Bind(R.id.qyqviewPager)
    ViewPager qyqviewPager;
    QyqFragmentAdapter qyqFragmentAdapter;
    private String[] tabs = new String[]{"隔壁", "已粉", "视频", "话题"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_content_qiuyouquan, container, false);
        ButterKnife.bind(this, view);
        initView();
        return view;
    }

    private void initView() {
        listFragments = new ArrayList<>();
        listFragments.add(new GBiFragment());
        listFragments.add(new YFenFragment());
        listFragments.add(new VideoFragment());
        listFragments.add(new HTiFragment());
        qyqFragmentAdapter = new QyqFragmentAdapter(getChildFragmentManager(), listFragments);
        qyqviewPager.setAdapter(qyqFragmentAdapter);
        qyqtablayout.setupWithViewPager(qyqviewPager);
        qyqtablayout.setTabMode(TabLayout.MODE_FIXED);
        for (int i = 0; i < qyqtablayout.getTabCount(); i++) {
            qyqtablayout.getTabAt(i).setText(tabs[i]);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
