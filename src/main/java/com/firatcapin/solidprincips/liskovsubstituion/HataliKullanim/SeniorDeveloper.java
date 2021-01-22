package com.firatcapin.solidprincips.liskovsubstituion.HataliKullanim;

public class SeniorDeveloper implements IDeveloper{
    @Override
    public String projeGelistir() {
        return "Proje Geliştiriyorum";
    }

    @Override
    public String solidPrensipleriKullan() {
        return "Solid Prensipleri Kullanıyorum";
    }
}
