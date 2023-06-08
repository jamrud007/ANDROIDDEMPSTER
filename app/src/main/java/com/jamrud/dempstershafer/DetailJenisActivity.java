package com.jamrud.dempstershafer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class DetailJenisActivity extends Activity {
    private ImageView img;
    private TextView tvCategory;
    private TextView tvdescription;
    private TextView tvtittle;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_detail_jenis_penyakit);
        this.tvtittle = (TextView) findViewById(R.id.txttittle);
        this.tvdescription = (TextView) findViewById(R.id.txtDesc);
        this.tvCategory = (TextView) findViewById(R.id.txtkategori);
        this.img = (ImageView) findViewById(R.id.bookthumbnai);
        Intent intent = getIntent();
        String string = intent.getExtras().getString("Nama");
        String string2 = intent.getExtras().getString("Deskripsi");
        int i = intent.getExtras().getInt("Gambar");
        String string3 = intent.getExtras().getString("Kategori");
        this.tvtittle.setText(string);
        this.tvdescription.setText(string2);
        this.img.setImageResource(i);
        this.tvCategory.setText(string3);
    }
}
