package com.firatcapin.solidprincips.dependencyinversion.DogruKullanim;

public class TextReader implements IReader{

    @Override
    public String read() {
        return "Kodları text olarak oku.";
    }
}
