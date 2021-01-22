package com.firatcapin.solidprincips.liskovsubstituion.HataliKullanim;

public class JuniorDeveloper implements IDeveloper {
    @Override
    public String projeGelistir() {
        return "Proje Geliştiriyorum";
    }

    /** JuniorDeveloper Solid Prensiplerini kUllanmadığı hald Bu class da bu metod bulunuyor. **/
    @Override
    public String solidPrensipleriKullan() {
        return null;
    }
}
