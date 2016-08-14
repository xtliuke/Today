package orz.keng.today.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;

import com.loopj.android.image.SmartImageView;

import orz.keng.today.R;

public class SplashActivity extends AppCompatActivity {

    private SmartImageView siv_splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
        gotoMainActivity();
        initSettings();
    }

    private void initSettings() {

    }

    private void gotoMainActivity() {

        //延时3秒跳转页面到主页面
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }

    private void initView() {
        siv_splash = (SmartImageView) findViewById(R.id.siv_splash);

        //设置半透明的渐变动画
        AlphaAnimation alphaAnimation = new AlphaAnimation(0f,1f);
        alphaAnimation.setDuration(2000);
        siv_splash.setAnimation(alphaAnimation);
    }
}
