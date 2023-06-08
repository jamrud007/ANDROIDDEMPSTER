package com.jamrud.dempstershafer;

import android.app.Activity;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;


/* loaded from: classes.dex */
public class MainActivity extends Activity {
    private static final int REQ_CODE_SPEECH_INPUT = 100;
    RelativeLayout Relativemenuu;
    Button ReloadPerintahSuara;
    Adapter adapter;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    private ImageButton mSpeakBtn;
    private TextView mVoiceInputTv;
    List<ColorSpace.Model> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void PindahPetunjuk(View view) {
        startActivity(new Intent(this, Petunjuk.class));
    }
    public void PindahProfil(View view) {
        startActivity(new Intent(this, ProfileActivity.class));
    }




    public void PindahDiagnosa(View view) {
        startActivity(new Intent(this, Konsultasi.class));
    }



    public void PindahJenisPenyakit(View view) {
        startActivity(new Intent(this, JenisPenyakitActivity.class));
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }

}
