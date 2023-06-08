package com.jamrud.dempstershafer;

import android.util.Log;
import android.util.Pair;

import java.util.ArrayList;
import java.util.Iterator;


public class Gejala {
    double bb;
    double bobotAvg;
    double bobotSum;
    String kode;
    String nama;
    String name;
    ArrayList<Pair> penyakitBobots;

    public Gejala(String str, String str2) {
        this.name = "";
        this.kode = str;
        this.nama = str2;
        this.penyakitBobots = new ArrayList<>();
        this.bobotAvg = 0.0d;
        this.bobotSum = 0.0d;
    }

    public Gejala(String str, double d) {
        this.name = "";
        this.kode = str;
        this.bobotAvg = d;
    }

    public Gejala(String str) {
        this.name = "";
        this.kode = str;
    }

    public void addPenyakitBobot(Penyakit penyakit, double d) {
        this.penyakitBobots.add(new Pair(penyakit, Double.valueOf(d)));
        this.bobotSum += d;
        this.bobotAvg = this.bobotSum / this.penyakitBobots.size();
    }

    public ArrayList<Pair> getPenyakitBobot() {
        return this.penyakitBobots;
    }

    public void printGejala() {
        Penyakit penyakit;
        if (this.kode.equals("null")) {
            return;
        }
        if (this.kode.equals("0")) {
            Log.d("penyakit", "0");
            Log.d("Bobot average: ", String.valueOf(this.bobotAvg));
            return;
        }
        Iterator<Pair> it = getPenyakitBobot().iterator();
        String str = "";
        while (it.hasNext()) {
            Pair pair = it.next();
            penyakit = (Penyakit) pair.first;
            if (penyakit != null) {
                str = str + penyakit.getKode() + " ";
            }
        }

        Log.d("Penyakit: ", str);
        double d = this.bobotAvg;
        this.name = str;
        this.bb = d;
        if (getPenyakitBobot() != null && getPenyakitBobot().size() == 0) {
            System.out.println("");
        }
    }
}