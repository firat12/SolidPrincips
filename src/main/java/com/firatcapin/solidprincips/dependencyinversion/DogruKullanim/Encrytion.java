package com.firatcapin.solidprincips.dependencyinversion.DogruKullanim;

public class Encrytion {
    private IReader reader;

    public String encryionread(){
        return  reader.read();
    }
}
