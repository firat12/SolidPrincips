package com.firatcapin.solidprincips.interfacesegregation.HataliKullanim;

public class Bmw implements IArac {
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
