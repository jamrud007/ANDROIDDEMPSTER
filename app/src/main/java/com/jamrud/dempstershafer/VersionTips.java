package com.jamrud.dempstershafer;

/* loaded from: classes.dex */
public class VersionTips {
    private String apiLevel;
    private String codeName;
    private String descrpition;
    private boolean expendable = false;
    private String version;

    public VersionTips(String str, String str2, String str3, String str4) {
        this.codeName = str;
        this.version = str2;
        this.apiLevel = str3;
        this.descrpition = str4;
    }

    public boolean isExpendable() {
        return this.expendable;
    }

    public void setExpendable(boolean z) {
        this.expendable = z;
    }

    public String getCodeName() {
        return this.codeName;
    }

    public void setCodeName(String str) {
        this.codeName = str;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getApiLevel() {
        return this.apiLevel;
    }

    public void setApiLevel(String str) {
        this.apiLevel = str;
    }

    public String getDescrpition() {
        return this.descrpition;
    }

    public void setDescrpition(String str) {
        this.descrpition = str;
    }

    public String toString() {
        return "Versions{codeName='" + this.codeName + "', version='" + this.version + "', apiLevel='" + this.apiLevel + "', descrpition='" + this.descrpition + "'}";
    }
}
