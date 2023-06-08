package com.jamrud.dempstershafer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

/* loaded from: classes.dex */
public class SplashActivity extends Activity {
    private static int SPLASH_TIME_OUT = 5000;
    TextView Shafer;
    TextView a;
    Animation bottomAnimation;
    View fifth;
    View first;
    View fourth;
    Animation middleAnimation;
    View second;
    View sixth;
    TextView slogan;
    View third;
    Animation topAnimation;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_splash);
        this.topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        this.bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        this.middleAnimation = AnimationUtils.loadAnimation(this, R.anim.middle_animation);
        this.first = findViewById(R.id.first_line);
        this.second = findViewById(R.id.second_line);
        this.third = findViewById(R.id.third_line);
        this.fourth = findViewById(R.id.fourth_line);
        this.fifth = findViewById(R.id.fifth_line);
        this.sixth = findViewById(R.id.sixth_line);
        this.a = (TextView) findViewById(R.id.a);
        this.slogan = (TextView) findViewById(R.id.tagLine);
        this.Shafer = (TextView) findViewById(R.id.shafer);
        this.first.setAnimation(this.topAnimation);
        this.second.setAnimation(this.topAnimation);
        this.third.setAnimation(this.topAnimation);
        this.fourth.setAnimation(this.topAnimation);
        this.fifth.setAnimation(this.topAnimation);
        this.sixth.setAnimation(this.topAnimation);
        this.a.setAnimation(this.middleAnimation);
        this.Shafer.setAnimation(this.middleAnimation);
        this.slogan.setAnimation(this.bottomAnimation);
        new Handler().postDelayed(new Runnable() { // from class: com.imam.android.SplashActivity.1
            @Override // java.lang.Runnable
            public void run() {
                SplashActivity.this.startActivity(new Intent(SplashActivity.this, IntroActivity.class));
                SplashActivity.this.finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
