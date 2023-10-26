package com.example.listview;

public class ListData {
    String name, pem, peng, kategori, uang;
    int ingredients, desc;
    int image;

    public ListData(String name, String pem, String peng, String kategori, String uang, int image) {
        this.name = name;
        this.pem = pem;
        this.peng = peng;
        this.uang = uang;
        this.kategori = kategori;
        this.image = image;
    }
}