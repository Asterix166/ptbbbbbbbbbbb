package com.example.listview;

public class ListData {
    String name, time, peng, kategori, uang;
    int ingredients, desc;
    int image;

    public ListData(String name, String time, String peng, String kategori, String uang, int ingredients, int desc, int image) {
        this.name = name;
        this.time = time;
        this.peng = peng;
        this.uang = uang;
        this.kategori = kategori;
        this.ingredients = ingredients;
        this.desc = desc;
        this.image = image;
    }
}