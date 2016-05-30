package com.example.qiubai2.details;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.qiubai2.R;
import com.example.qiubai2.bean.ScandadetailsBean;
import com.makeramen.roundedimageview.RoundedImageView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by john on 2016/5/25.
 */
public class ScandaldetailsActivity extends AppCompatActivity implements ScandaldetailsView {

    private static final String TAG = "test";
    @Bind(R.id.touxiang_item)
    RoundedImageView touxiangItem;
    @Bind(R.id.hot_tv_item)
    TextView hotTvItem;
    @Bind(R.id.name_tv_item)
    TextView nameTvItem;
    @Bind(R.id.content_tv_item)
    TextView contentTvItem;
    @Bind(R.id.content_img)
    ImageView contentImg;
    @Bind(R.id.like_tv_item)
    TextView likeTvItem;
    @Bind(R.id.comment_tv_item)
    TextView commentTvItem;
    @Bind(R.id.share_tv_item)
    TextView shareTvItem;
    @Bind(R.id.details_recyclerview)
    RecyclerView detailsRecycleview;
    ScandaldetailsPresenter scandaldetailsPresenter;
    DetailsAdapter detailsAdapter;
    String number;

    @Bind(R.id.details_id)
    TextView detailsId;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_fragment);
        ButterKnife.bind(this);
        Bundle bundle = getIntent().getExtras();
        String id = bundle.getString("id");
        detailsId.setText("糗事"+id);
        number = id;
        scandaldetailsPresenter = new ScandaldetailsPresenterimpl(this);
        scandaldetailsPresenter.getScandaldetails(number);
        String name = bundle.getString("name");
        nameTvItem.setText(name);
        String icon = bundle.getString("icon");
        String iconid = bundle.getString("iconid");

        if (iconid.length() == 8) {
            String subuserid = iconid.substring(0, 4);
            Glide.with(this).load("http://pic.qiushibaike.com/system/avtnew/"
                    + subuserid + "/" + iconid + "/medium/" + icon).into(touxiangItem);
            //头像id长度是7
        } else if (iconid.length() == 7) {
            String subuserid = iconid.substring(0, 3);
            Glide.with(this).load("http://pic.qiushibaike.com/system/avtnew/"
                    + subuserid + "/" + iconid + "/medium/" + icon).into(touxiangItem);
        }
        String a = bundle.getString("imageid");
        String b = bundle.getString("image");
        Log.i(TAG, "onCreate: " + a + "img" + b);
        String suimage = a.substring(0, 5);

        Glide.with(this).load("http://pic.qiushibaike.com/system/pictures/"
                + suimage + "/" + a + "/medium/" + b).into(contentImg);


        String content = bundle.getString("content");
        contentTvItem.setText(content);

        String hot = bundle.getString("hot");
        if (hot.length() == 3) {
            hotTvItem.setText("\uD83D\uDD25 热门");
        } else if (hot.length() == 7) {
            hotTvItem.setText("\uD83D\uDC51 精选");
        } else if (hot.length() == 5) {
            hotTvItem.setText("\uD83C\uDF4A 新鲜");
        }

        String like = bundle.getString("like");
        likeTvItem.setText("搞笑" + like);
        String count = bundle.getString("count");
        commentTvItem.setText("评论" + count);
        String share = bundle.getString("share");
        shareTvItem.setText("分享" + share);
    }

    @Override
    public void initScandaldetailsView(ScandadetailsBean scandadetailsEntity) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(OrientationHelper.VERTICAL);
        detailsRecycleview.setNestedScrollingEnabled(false);
        detailsRecycleview.setLayoutManager(linearLayoutManager);
        detailsAdapter = new DetailsAdapter(this, scandadetailsEntity.getItems());
        detailsRecycleview.setLayoutManager(new LinearLayoutManager(this));
        detailsRecycleview.setAdapter(detailsAdapter);
    }

    @Override
    public void showToast(CharSequence msg) {

    }
}
