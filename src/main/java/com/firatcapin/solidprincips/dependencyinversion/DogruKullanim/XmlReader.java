package com.firatcapin.solidprincips.dependencyinversion.DogruKullanim;

public class XmlReader implements IReader{
    @Override
    public String read() {
        return "Kodları xml olarak oku.";
    }
}
