package com.firatcapin.solidprincips.liskovsubstituion.DogruKullanim;

public class SeniorDeveloper extends Developer implements ISolidPrensip {

    @Override
    public String projeGelistir() {
        return "Proje Geliştiriyorum";
    }

    @Override
    public String solidPrensipleriKullan() {
        return "Solid Prensipleri Kullanıyorum";
    }

}
