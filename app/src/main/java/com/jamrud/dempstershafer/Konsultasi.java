package com.jamrud.dempstershafer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;


public class Konsultasi extends Activity {
    private List<Double> bobot1;
    private List<Double> bobot10;
    private List<Double> bobot11;
    private List<Double> bobot12;
    private List<Double> bobot13;
    private List<Double> bobot2;
    private List<Double> bobot3;
    private List<Double> bobot4;
    private List<Double> bobot5;
    private List<Double> bobot6;
    private List<Double> bobot7;
    private List<Double> bobot8;
    private List<Double> bobot9;
    private List<Double> bobot15;

    private List<Double> bobot14;
    private Button btn;
    private ArrayList<String> gejala;
    private List penyakit;

    private Double x;
    private Double x1;
    private Double x10;
    private Double x11;
    private Double x12;
    private Double x2;
    private Double x3;
    private Double x4;
    private Double x5;
    private Double x6;
    private Double x7;
    private Double x8;
    private Double x9;
    public int i = 0;
    public int[] numberikangka = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
    ArrayList<Integer> arraypenampung = new ArrayList<>();
    DempsterShaffer ds = new DempsterShaffer();
    String[] inputGejalas = {"G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8", "G9", "G10", "G11", "G12", "G13", "G14", "G15", "G16", "G17", "G18", "G19", "G20", "G21", "G22"};

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_konsultasi);
        this.btn = findViewById(R.id.btndiagnosa);
        this.gejala = new ArrayList<>();
        this.penyakit = new ArrayList();
        this.bobot1 = new ArrayList();
        this.bobot2 = new ArrayList();
        this.bobot3 = new ArrayList();
        this.bobot4 = new ArrayList();
        this.bobot5 = new ArrayList();
        this.bobot6 = new ArrayList();
        this.bobot7 = new ArrayList();
        this.bobot8 = new ArrayList();
        this.bobot9 = new ArrayList();
        this.bobot10 = new ArrayList();
        this.bobot11 = new ArrayList();
        this.bobot12 = new ArrayList();
        this.bobot13 = new ArrayList();
        this.bobot14 = new ArrayList();
        this.bobot15 = new ArrayList();
        final CheckBox checkBox = findViewById(R.id.cb1);
        final CheckBox checkBox2 = findViewById(R.id.cb2);
        final CheckBox checkBox3 = findViewById(R.id.cb3);
        final CheckBox checkBox4 = findViewById(R.id.cb4);
        final CheckBox checkBox5 = findViewById(R.id.cb5);
        final CheckBox checkBox6 = findViewById(R.id.cb6);
        final CheckBox checkBox7 = findViewById(R.id.cb7);
        final CheckBox checkBox8 = findViewById(R.id.cb8);
        final CheckBox checkBox9 = findViewById(R.id.cb9);
        final CheckBox checkBox10 = findViewById(R.id.cb10);
        final CheckBox checkBox11 = findViewById(R.id.cb11);
        final CheckBox checkBox12 = findViewById(R.id.cb12);
        final CheckBox checkBox13 = findViewById(R.id.cb13);
        final CheckBox checkBox14 = findViewById(R.id.cb14);
        final CheckBox checkBox15 = findViewById(R.id.cb15);
        final CheckBox checkBox16 = findViewById(R.id.cb16);
        final CheckBox checkBox17 = findViewById(R.id.cb17);
        final CheckBox checkBox18 = findViewById(R.id.cb18);
        final CheckBox checkBox19 = findViewById(R.id.cb19);
        final CheckBox checkBox20 = findViewById(R.id.cb20);
        final CheckBox checkBox21 = findViewById(R.id.cb21);
        final CheckBox checkBox22 = findViewById(R.id.cb22);
        this.btn.setOnClickListener(new View.OnClickListener() { // from class: com.jamrud.dempsterKonsultasi.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int i;
                int checkedCount = 0;
                if (checkBox.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G1", "Gigi Goyang", new int[]{3}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i = 1;
                } else {
                    i = 0;
                    checkedCount++;
                }
                if (checkBox2.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G2", "Sakit gigi yang muncul secara tiba-tiba tanpa sebab jelas", new int[]{4}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;
                    checkedCount++;
                }
                if (checkBox3.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G3", "Gigi jadi lebih sensitif", new int[]{1}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;
                    checkedCount++;
                }
                if (checkBox4.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G4", "Muncul lubang yang terlihat sangat jelas di gigi", new int[]{1}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;
                    checkedCount++;
                }
                if (checkBox5.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G5", "Bau Mulut", new int[]{6, 7}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;
                    checkedCount++;
                }
                if (checkBox6.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G6", "Dentin terlihat", new int[]{1}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;
                    checkedCount++;
                }
                if (checkBox7.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G7", "Sakit berdenyut tanpa rangsangan", new int[]{4}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;
                    checkedCount++;
                }
                if (checkBox8.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G8", "Nyeri Saat berbaring", new int[]{4}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;
                    checkedCount++;
                }
                if (checkBox9.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G9", "Lubang Sangat Besar di Gigi", new int[]{1}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;
                    checkedCount++;
                }
                if (checkBox10.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G10", "Muncul benjolan merah pada lubang gigi", new int[]{1}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;
                    checkedCount++;
                }
                if (checkBox11.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G11", "Nyeri saat mengunyah", new int[]{5}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;
                    checkedCount++;
                }
                if (checkBox12.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G12", "Ruang pulpa terbuka", new int[]{1, 5}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;
                    checkedCount++;
                }
                if (checkBox13.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G13", "Terdapat Endapan Plak", new int[]{2, 3}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;
                    checkedCount++;
                }
                if (checkBox14.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G14", "Terdapat karang gigi", new int[]{2, 3, 6}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;
                    checkedCount++;
                }
                if (checkBox15.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G15", "Gusi mudah berdarah", new int[]{2, 3, 6}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;
                    checkedCount++;
                }
                if (checkBox16.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G16", "Gusi Bengkak", new int[]{2, 3, 6}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;
                    checkedCount++;
                }
                if (checkBox17.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G17", "Demam", new int[]{2, 3}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;
                    checkedCount++;
                }
                if (checkBox18.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G18", "Resesi Gusi", new int[]{6, 7}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;checkedCount++;
                }
                if (checkBox19.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G19", "Kemerahan Pada Gusi", new int[]{2, 3}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;checkedCount++;
                }
                if (checkBox20.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G20", "Terdapat Nanah Diantara Gusi Dan Gigi", new int[]{1, 7}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;checkedCount++;
                }
                if (checkBox21.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G21", "Terjadi Pendarahan Pada Gusi Ketika Menyikat Atau Membersihkan Gigi", new int[]{2, 3}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;checkedCount++;
                }
                if (checkBox22.isChecked()) {
                    Konsultasi.this.ds.a(Konsultasi.this.i, "G22", "Gusi Terasa Lunak", new int[]{2, 3}, new double[]{0.8d});
                    Konsultasi.this.i++;
                    i++;checkedCount++;
                }
                if (i == 0) {
                    Intent intent = new Intent(Konsultasi.this, HasildiagnosaActivity.class);
                    intent.putExtra("persentase", "Data kosong");
                    intent.putExtra("penyakit", "Silahkan Isi Ulang Pilihan Gejala");
                    Konsultasi.this.startActivity(intent);
                }
                if (i == 1) {
                    Intent intent2 = new Intent(Konsultasi.this, HasildiagnosaActivity.class);
                    intent2.putExtra("persentase", "Data kosong");
                    intent2.putExtra("penyakit", "Silahkan Isi Ulang Pilihan Gejala Minimal 2 gejala");
                    Konsultasi.this.startActivity(intent2);
                }


                ArrayList<Gejala> predict = Konsultasi.this.ds.predict(Konsultasi.this.inputGejalas);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                new ArrayList();
                Iterator<Gejala> it = predict.iterator();
                while (it.hasNext()) {
                    Gejala next = it.next();
                    next.printGejala();
                    arrayList.add(next.name);
                    arrayList2.add(Double.valueOf(next.bb));
                    Log.d("Penyakit Gigi", String.valueOf(next.name));
                }


                Double d;
                if (arrayList2.isEmpty()) {
                    // Menampilkan pesan toast atau melakukan penanganan lainnya jika arrayList2 kosong
                    Toast.makeText(Konsultasi.this, "Silahkan Isi Ulang", Toast.LENGTH_SHORT).show();
                    return; // Menghentikan eksekusi lebih lanjut jika arrayList2 kosong
                } else {
                    d = (Double) Collections.max(arrayList2);
                }
                int indexOf = arrayList2.indexOf(d);
                Log.d("bobot", arrayList.get(indexOf) + " bobot " + d.doubleValue() * 100.0d);
                float doubleValue = (float) (d.doubleValue() * 100.0d);
                Intent intent3 = new Intent(Konsultasi.this, HasildiagnosaActivity.class);
                intent3.putExtra("persentase", String.format("%.2f", Float.valueOf(doubleValue)) + "%");
                intent3.putExtra("penyakit", String.valueOf(arrayList.get(indexOf)));
                Konsultasi.this.startActivity(intent3);
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        Intent intent4 = new Intent(Konsultasi.this, MainActivity.class);
        startActivity(intent4);
    }
}
