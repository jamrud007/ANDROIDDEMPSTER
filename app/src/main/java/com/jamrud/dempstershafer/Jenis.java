package com.jamrud.dempstershafer;

/* loaded from: classes.dex */
public class Jenis {
    private String DeskripsiJenis;
    private int GambarJenis;
    private String KategoriJenis;
    private String NamaJenis;

    public Jenis() {
    }

    public Jenis(String str, String str2, String str3, int i) {
        this.NamaJenis = str;
        this.KategoriJenis = str2;
        this.DeskripsiJenis = str3;
        this.GambarJenis = i;
    }

    public String getNamaJenis() {
        return this.NamaJenis;
    }

    public String getKategoriJenis() {
        return this.KategoriJenis;
    }

    public String getDeskripsiJenis() {
        return this.DeskripsiJenis;
    }

    public int getGambarJenis() {
        return this.GambarJenis;
    }
}
