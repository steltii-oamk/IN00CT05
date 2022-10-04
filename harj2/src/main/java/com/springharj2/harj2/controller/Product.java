package com.springharj2.harj2.controller;

public class Product {
    protected String nimi;
    protected int hinta;

    public Product(String nimi, int hinta){
        this.nimi = nimi;
        this.hinta = hinta;
    }

    public String getNimi(){
        return nimi;
    }

    public int getHinta(){
        return hinta;
    }
}
