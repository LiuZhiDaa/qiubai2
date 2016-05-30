package com.example.qiubai2.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by lt on 2015/12/14.
 */
public class TabFragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> list_fragment;                         //fragment列表

    public TabFragmentAdapter(FragmentManager fm, List<Fragment> list_fragment) {
        super(fm);
        this.list_fragment=list_fragment;
    }




    @Override
    public Fragment getItem(int position) {
        return list_fragment.get(position);
    }

    @Override
    public int getCount() {
        return list_fragment.size();
    }

}
