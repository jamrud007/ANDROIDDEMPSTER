package com.jamrud.dempstershafer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes.dex */
public class DetailJenisPenyakitActivity extends AppCompatActivity {
    private ImageView img1;
    private TextView tvCategory1;
    private TextView tvdescription1;
    private TextView tvtittle1;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_detail_jenis_penyakit);
        this.tvtittle1 = (TextView) findViewById(R.id.txttittle);
        this.tvdescription1 = (TextView) findViewById(R.id.txtDesc);
        this.tvCategory1 = (TextView) findViewById(R.id.txtkategori);
        this.img1 = (ImageView) findViewById(R.id.bookthumbnai);
        Intent intent = getIntent();
        String string = intent.getExtras().getString("Nama");
        String string2 = intent.getExtras().getString("Deskripsi");
        int i = intent.getExtras().getInt("Gambar");
        String string3 = intent.getExtras().getString("Kategori");
        this.tvtittle1.setText(string);
        this.tvdescription1.setText(string2);
        this.img1.setImageResource(i);
        this.tvCategory1.setText(string3);
    }
}
