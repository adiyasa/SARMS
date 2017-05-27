package com.example.raw.sev100;

/**
 * Created by R A W on 27/05/2017.
 */

public class TheUnit {
    String uCode;
    String uName;

    public TheUnit(String uCode, String uName){
        this.uCode = uCode;
        this.uName = uName;
    }

    public String getuCode() {
        return uCode;
    }

    public void setuCode(String uCode) {
        this.uCode = uCode;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }
}

