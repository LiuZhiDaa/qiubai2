package com.example.qiubai2.qiuyouquan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qiubai2.R;

/**
 * Created by 44744 on 2016/5/24.
 */
public class GBiFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_gb_qyqclassify, container, false);

        return view;
    }
}
