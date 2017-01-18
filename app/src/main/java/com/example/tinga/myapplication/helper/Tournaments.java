package com.example.tinga.myapplication.helper;

/**
 * Created by Tinga on 2016/12/12.
 */
public class Tournaments {
    String name;
    String date;

    public Tournaments(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
