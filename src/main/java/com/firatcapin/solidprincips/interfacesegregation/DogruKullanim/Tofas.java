package com.firatcapin.solidprincips.interfacesegregation.DogruKullanim;

public class Tofas implements IArac {
    @Override
    public String start() {
        return "Araba çalıştı";
    }

    @Override
    public String stop() {
        return "Araba durdu";
    }

}
