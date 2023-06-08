package com.jamrud.dempstershafer;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class IntroActivity extends Activity {
    Animation btnAnim;
    Button btnGetStarted;
    Button btnNext;
    IntroViewPagerAdapter introViewPagerAdapter;
    int position = 0;
    private ViewPager screenPager;
    TabLayout tabIndicator;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        if (restorePrefData()) {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }
        setContentView(R.layout.activity_intro);
        this.tabIndicator = (TabLayout) findViewById(R.id.tabLayout);
        this.btnNext = (Button) findViewById(R.id.btn_next);
        this.btnGetStarted = (Button) findViewById(R.id.btn_getstarted);
        this.btnAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_animation);
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new ScreenItem("Sistem Pakar", "Menggunakan metode dempster shafer sebagai penentu keputusan", R.drawable.science));
        arrayList.add(new ScreenItem("Identifikasi Penyakit", "Melakukan identifikasi awal, penyakit apa yg menyerang gigi anda ", R.drawable.scientist));
        arrayList.add(new ScreenItem("Fitur Tambahan", "Memiliki tips solusi dan data penyakit", R.drawable.gigi_logo));
        this.screenPager = (ViewPager) findViewById(R.id.screen_viewpager);
        this.introViewPagerAdapter = new IntroViewPagerAdapter(this, arrayList);
        this.screenPager.setAdapter(this.introViewPagerAdapter);
        this.tabIndicator.setupWithViewPager(this.screenPager);
        this.btnNext.setOnClickListener(new View.OnClickListener() { // from class: com.imam.android.IntroActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IntroActivity introActivity = IntroActivity.this;
                introActivity.position = introActivity.screenPager.getCurrentItem();
                if (IntroActivity.this.position < arrayList.size()) {
                    IntroActivity.this.position++;
                    IntroActivity.this.screenPager.setCurrentItem(IntroActivity.this.position);
                }
                if (IntroActivity.this.position == arrayList.size() - 1) {
                    IntroActivity.this.loadLastScreen();
                }
            }
        });
        this.tabIndicator.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() { // from class: com.imam.android.IntroActivity.2
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == arrayList.size() - 1) {
                    IntroActivity.this.loadLastScreen();
                }
                if (tab.getPosition() == arrayList.size() - 2) {
                    IntroActivity.this.btnGetStarted.setVisibility(4);
                    IntroActivity.this.btnNext.setVisibility(0);
                }
            }
        });
        this.btnGetStarted.setOnClickListener(new View.OnClickListener() { // from class: com.imam.android.IntroActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IntroActivity.this.startActivity(new Intent(IntroActivity.this.getApplicationContext(), MainActivity.class));
                IntroActivity.this.finish();
            }
        });
    }

    private boolean restorePrefData() {
        return Boolean.valueOf(getApplicationContext().getSharedPreferences("mypref", 0).getBoolean("IsIntroOpen", false)).booleanValue();
    }

    private void savePrefsData() {
        SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("mypref", 0).edit();
        edit.putBoolean("IsIntroOpen", true);
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadLastScreen() {
        this.btnNext.setVisibility(4);
        this.btnGetStarted.setVisibility(0);
        this.tabIndicator.setVisibility(0);
        this.btnGetStarted.setAnimation(this.btnAnim);
    }
}
