package com.jamrud.dempstershafer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class HasildiagnosaActivity extends Activity implements View.OnClickListener {
    private static final int STORAGE_CODE = 1000;
    TextView Penyakit;
    TextView SolusiPenyakit1;
    private ArrayList<Double> hasildiagnosa = new ArrayList<>();
    TextView persentase;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_diagnosa);
        Bundle extras = getIntent().getExtras();
        this.Penyakit = (TextView) findViewById(R.id.penyakit);
        this.persentase = (TextView) findViewById(R.id.persen);
        this.SolusiPenyakit1 = (TextView) findViewById(R.id.Solusi);
        this.persentase.setText(extras.getString("persentase"));
        this.Penyakit.setText(extras.getString("penyakit"));

        ((Button) findViewById(R.id.lihatsolusi)).setOnClickListener(this);
        ((Button) findViewById(R.id.konsultasi)).setOnClickListener(this);
        ((Button) findViewById(R.id.beranda)).setOnClickListener(this);
        ((Button) findViewById(R.id.lihatnilai)).setOnClickListener(this);

    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.beranda) {
            startActivity(new Intent(this, MainActivity.class));
        } else if (id == R.id.konsultasi) {
            startActivity(new Intent(this, Konsultasi.class));
        } else if (id == R.id.lihatsolusi) {
            startActivity(new Intent(this, Solusi.class));
        } else if (id != R.id.lihatnilai) {
        } else {
            startActivity(new Intent(this, NilaiKemungkinanActivity.class));
        }

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        Intent intent4 = new Intent(HasildiagnosaActivity.this, Konsultasi.class);
        startActivity(intent4);
    }

}
