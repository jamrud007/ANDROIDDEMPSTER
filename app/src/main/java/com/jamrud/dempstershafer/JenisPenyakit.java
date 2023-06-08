package com.jamrud.dempstershafer;

/* loaded from: classes.dex */
public class JenisPenyakit {
    private String DeskripsiJenis;
    private int GambarJenis;
    private String KategoriJenis;
    private String NamaJenis;

    public JenisPenyakit(String str, String str2, int i) {
        this.NamaJenis = str;
        this.KategoriJenis = str2;
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
