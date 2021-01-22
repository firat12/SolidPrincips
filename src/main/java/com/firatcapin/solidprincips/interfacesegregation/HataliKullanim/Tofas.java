package com.firatcapin.solidprincips.interfacesegregation.HataliKullanim;

public class Tofas implements IArac{
    @Override
    public String start() {
        return "Araba çalıştı";
    }

    @Override
    public String stop() {
        return "Araba durdu";
    }

    @Override
    public String otoPilot() {
        return null;
    }
}
