package com.example.qiubai2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.qiubai2.adapter.TabFragmentAdapter;
import com.example.qiubai2.Home.QSFragment;
import com.example.qiubai2.qiuyouquan.QyqFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

;

public class MainActivity extends AppCompatActivity {
    List<Fragment> fragmentList;
    @Bind(R.id.tablayout)
    TabLayout tablayout;
    @Bind(R.id.viewPager)
    ViewPager viewPager;
    TabFragmentAdapter tabFragmentAdapter;
    private String[] tabs = new String[]{"糗事", "糗友圈", "发现", "小纸条", "我"};
    int[] images = {R.drawable.tab_menu_qiushi, R.drawable.tab_menu_quan, R.drawable.tab_menu_faxian, R.drawable.tab_menu_xiaozhitiao, R.drawable.tab_menu_me};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }
    private void initView() {

        fragmentList = new ArrayList<>();
        fragmentList.add(new QSFragment());
        fragmentList.add(new QyqFragment());
        fragmentList.add(new FxFragment());
        fragmentList.add(new XztFragment());
        fragmentList.add(new MeFragment());
        tabFragmentAdapter = new TabFragmentAdapter(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(tabFragmentAdapter);
        tablayout.setupWithViewPager(viewPager);
        tablayout.setTabMode(TabLayout.MODE_FIXED);
        for (int i = 0; i < tablayout.getTabCount(); i++) {
            tablayout.getTabAt(i).setText(tabs[i]).setIcon(images[i]);
        }
    }

}

