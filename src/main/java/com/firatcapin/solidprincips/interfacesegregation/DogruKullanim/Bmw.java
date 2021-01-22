package com.firatcapin.solidprincips.interfacesegregation.DogruKullanim;

public class Bmw implements IOtoPilot {

    @Override
    public String start() {
        return "Araba Çalıştı";
    }

    @Override
    public String stop() {
        return "Araba Durdu";
    }

    @Override
    public String otoPilot() {
        return "Araba oto pilota alındı";
    }
}
