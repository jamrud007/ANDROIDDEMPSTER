package com.jamrud.dempstershafer;

/* loaded from: classes.dex */
public class Model {
    private String desc;
    private int image;
    private String tittle;

    public Model(int i, String str, String str2) {
        this.image = i;
        this.tittle = str;
        this.desc = str2;
    }

    public int getImage() {
        return this.image;
    }

    public void setImage(int i) {
        this.image = i;
    }

    public String getTittle() {
        return this.tittle;
    }

    public void setTittle(String str) {
        this.tittle = str;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String str) {
        this.desc = str;
    }
}
