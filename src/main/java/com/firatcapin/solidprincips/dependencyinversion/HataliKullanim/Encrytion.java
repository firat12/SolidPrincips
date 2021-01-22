package com.firatcapin.solidprincips.dependencyinversion.HataliKullanim;

public class Encrytion {
    private TextReader textReader;
    private XmlReader xmlReader;

    public Encrytion(TextReader textReader, XmlReader xmlReader){
        this.textReader = textReader;
        this.xmlReader = xmlReader;
    }
}
