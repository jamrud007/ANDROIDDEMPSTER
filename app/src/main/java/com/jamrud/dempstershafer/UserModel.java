package com.jamrud.dempstershafer;

/* loaded from: classes.dex */
public class UserModel {
    String gejala;
    boolean select;

    public UserModel(boolean z, String str) {
        this.select = false;
        this.gejala = "";
        this.select = z;
        this.gejala = str;
    }

    public boolean isSelected() {
        return this.select;
    }
}
