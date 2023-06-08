package com.jamrud.dempstershafer;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class DempsterShaffer {
    Gejala[] gejalas = new Gejala[100];
    Penyakit[] penyakits = new Penyakit[100];
    String[] peny = {"", "Karies Gigi\n\n ", "Gingivitis\n\n","Periodontitis\n\n", "Pulpitis Akut\n\n", "Pulpitis Kronis\n\n", "Kalkulus\n\n", "Impaksi\n\n"};
    public String[] penyakit1 = {"", "KG", "GV", "PD", "PA", "PK", "KK", "IP"};

    public Gejala[] getGejalas() {
        return this.gejalas;
    }

    public Penyakit[] getPenyakits() {
        return this.penyakits;
    }

    public boolean cekPenyakits(Gejala gejala, Gejala gejala2) {
        ArrayList<Pair> penyakitBobot = gejala.getPenyakitBobot();
        ArrayList<Pair> penyakitBobot2 = gejala2.getPenyakitBobot();
        if (gejala.kode.equals("null") && gejala2.kode.equals("null")) {
            return true;
        }
        if (gejala.kode.equals("0") && gejala2.kode.equals("0")) {
            return true;
        }
        if (penyakitBobot == null || penyakitBobot2 == null || penyakitBobot.size() != penyakitBobot2.size() || penyakitBobot == null || penyakitBobot2 == null) {
            return false;
        }
        for (int i = 0; i < penyakitBobot.size(); i++) {
            Penyakit penyakit = (Penyakit) penyakitBobot.get(i).first;
            Penyakit penyakit2 = (Penyakit) penyakitBobot2.get(i).first;
            if (penyakit != null && !penyakit.kode.equals(penyakit2.kode)) {
                return false;
            }
        }
        return true;
    }

    public Gejala cross(Gejala gejala, Gejala gejala2) {
        Gejala gejala3 = new Gejala("123");
        if (gejala.kode.equals("0") && gejala2.kode.equals("0")) {
            gejala3.kode = "0";
        } else if (gejala.kode.equals("0")) {
            gejala3.penyakitBobots = gejala2.penyakitBobots;
        } else if (gejala2.kode.equals("0")) {
            gejala3.penyakitBobots = gejala.penyakitBobots;
        } else {
            gejala3.penyakitBobots = new ArrayList<>();
            Iterator<Pair> it = gejala.getPenyakitBobot().iterator();
            while (it.hasNext()) {
                Pair next = it.next();
                Iterator<Pair> it2 = gejala2.getPenyakitBobot().iterator();
                while (it2.hasNext()) {
                    Penyakit penyakit = (Penyakit) next.first;
                    Penyakit penyakit2 = (Penyakit) it2.next().first;
                    if (penyakit != null) {
                        Log.d("ggwp", String.valueOf(penyakit));
                        if (penyakit.kode.equals(penyakit2.kode)) {
                            gejala3.addPenyakitBobot(penyakit, 0.0d);
                        }
                    }
                }
            }
            if (gejala3.penyakitBobots.size() == 0) {
                gejala3.kode = "null";
            }
        }
        gejala3.bobotAvg = gejala.bobotAvg * gejala2.bobotAvg;
        return gejala3;
    }

    public ArrayList<Gejala> perkalianTabel(ArrayList<Gejala> arrayList, ArrayList<Gejala> arrayList2) {
        ArrayList<Gejala> arrayList3 = new ArrayList<>();
        Iterator<Gejala> it = arrayList.iterator();
        while (it.hasNext()) {
            Gejala next = it.next();
            Iterator<Gejala> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Gejala cross = cross(next, it2.next());
                boolean z = false;
                Iterator<Gejala> it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Gejala next2 = it3.next();
                    if (cekPenyakits(next2, cross)) {
                        next2.bobotAvg += cross.bobotAvg;
                        z = true;
                    }
                }
                if (!z) {
                    arrayList3.add(cross);
                }
            }
        }
        double d = 0.0d;
        Gejala gejala = null;
        Iterator<Gejala> it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Gejala next3 = it4.next();
            if (next3.kode.equals("null")) {
                d = next3.bobotAvg;
                gejala = next3;
            }
        }
        arrayList3.remove(gejala);
        Iterator<Gejala> it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            it5.next().bobotAvg /= 1.0d - d;
        }
        return arrayList3;
    }

    public Gejala findGejala(String str) {
        Gejala gejala;
        Gejala[] gejalaArr = this.gejalas;
        int length = gejalaArr.length;
        for (int i = 0; i < length && (gejala = gejalaArr[i]) != null; i++) {
            if (gejala.kode.equals(str)) {
                return gejala;
            }
        }
        return null;
    }
//loop inisialisai dan mengecheck semua gejala yang dipilih
    public ArrayList<Gejala> predict(String[] strArr) {
        LinkedList<ArrayList<Gejala>> linkedList = new LinkedList<>();
        for (String str : strArr) {
            Gejala findGejala = findGejala(str);
            if (findGejala != null) {
                ArrayList<Gejala> arrayList = new ArrayList<>();
                arrayList.add(findGejala);
                arrayList.add(new Gejala("0", 1.0d - findGejala.bobotAvg));
                linkedList.add(arrayList);
            }
        }
        ArrayList<Gejala> arrayList2 = null;
        while (linkedList.size() > 0) {
            if (arrayList2 == null) {
                arrayList2 = perkalianTabel(linkedList.remove(), linkedList.remove());
            } else {
                arrayList2 = perkalianTabel(arrayList2, linkedList.remove());
            }
        }
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>(); // Inisialisasi dengan ArrayList kosong jika null
        }
        return arrayList2;
    }


    public void a(int i, String str, String str2, int[] iArr, double[] dArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            Log.d("panjang", String.valueOf(this.peny[iArr[i2]]));
            this.penyakits[iArr[i2]] = new Penyakit(this.peny[iArr[i2]], this.penyakit1[iArr[i2]]);
        }
        this.gejalas[i] = new Gejala(str, str2);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.gejalas[i].addPenyakitBobot(this.penyakits[iArr[i3]], dArr[0]);
            Log.d("test", String.valueOf(iArr[i3]));
        }
    }
}
