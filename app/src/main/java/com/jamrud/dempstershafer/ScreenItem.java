package com.jamrud.dempstershafer;

/* loaded from: classes.dex */
public class ScreenItem {
    String Desccription;
    int ScreenImg;
    String Tittle;

    public ScreenItem(String str, String str2, int i) {
        this.Tittle = str;
        this.Desccription = str2;
        this.ScreenImg = i;
    }

    public String getTittle() {
        return this.Tittle;
    }

    public String getDesccription() {
        return this.Desccription;
    }

    public int getScreenImg() {
        return this.ScreenImg;
    }

    public void setTittle(String str) {
        this.Tittle = str;
    }

    public void setDesccription(String str) {
        this.Desccription = str;
    }

    public void setScreenImg(int i) {
        this.ScreenImg = i;
    }
}
