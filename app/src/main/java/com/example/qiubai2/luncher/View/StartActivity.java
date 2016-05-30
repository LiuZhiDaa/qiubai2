package com.example.qiubai2.luncher.View;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.qiubai2.MainActivity;
import com.example.qiubai2.R;
import com.example.qiubai2.bean.LuncherBean;
import com.example.qiubai2.luncher.Present.StartPresenter;
import com.example.qiubai2.luncher.Present.StartPresenterImp;

import butterknife.Bind;
import butterknife.ButterKnife;

public class StartActivity extends AppCompatActivity implements StartView {

    @Bind(R.id.start_img)
    ImageView startImg;

    StartPresenter startPresenter;
    @Bind(R.id.start_time)
    TextView startTime;

    private MyCountDownTimer mc;

    long i = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ButterKnife.bind(this);

        //透明状态栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //透明导航栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        startPresenter = new StartPresenterImp(this);
        startPresenter.getstartpresenter();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(StartActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },i);

        mc = new MyCountDownTimer(i,1000);
        mc.start();
        startTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
    }

//    @Override
//    public void startView(LuncherBean luncherBean) {
//        Glide.with(StartActivity.this).load(luncherBean.getItems().get(0).getPic_url()).into(startImg);
//        startImg.setScaleType(ImageView.ScaleType.FIT_XY);
//
//    }

    @Override
    public void startView(LuncherBean luncherBean) {
        Glide.with(StartActivity.this).load(luncherBean.getItems().get(0).getPic_url()).into(startImg);
        startImg.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    @Override
    public void showToas(CharSequence msg) {

    }

    class MyCountDownTimer extends CountDownTimer {
        /**
         * @param millisInFuture    表示以毫秒为单位 倒计时的总数
         *                          <p/>
         *                          例如 millisInFuture=1000 表示1秒
         * @param countDownInterval 表示 间隔 多少微秒 调用一次 onTick 方法
         *                          <p/>
         *                          例如: countDownInterval =1000 ; 表示每1000毫秒调用一次onTick()
         */
        public MyCountDownTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }
        @Override
        public void onFinish() {
            startTime.setText("loading.");
        }

        @Override
        public void onTick(long millisUntilFinished) {

            Log.i("0900", millisUntilFinished + "");

            startTime.setText((millisUntilFinished / 1000) + " | 跳转");

        }
    }
}
