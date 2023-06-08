package com.jamrud.dempstershafer;


public class Penyakit {
    String kode;
    String nama;

    public Penyakit(String str, String str2) {
        this.kode = str;
        this.nama = str2;
    }

    public String getNama() {
        return this.nama;
    }

    public String getKode() {
        return this.kode;
    }
}