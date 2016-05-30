package com.example.qiubai2.qiuyouquan;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by lt on 2015/12/14.
 */
public class QyqFragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> listfragments;                         //fragment列表

    public QyqFragmentAdapter(FragmentManager fm, List<Fragment> list_fragment) {
        super(fm);
        this.listfragments = list_fragment;
    }


    @Override
    public Fragment getItem(int position) {
        return listfragments.get(position);
    }

    @Override
    public int getCount() {
        return listfragments.size();
    }

}
