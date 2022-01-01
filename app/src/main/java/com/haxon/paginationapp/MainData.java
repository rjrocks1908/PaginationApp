package com.haxon.paginationapp;

public class MainData {

    private String image, name;

    public MainData(String image, String name) {
        this.image = image;
        this.name = name;
    }

    public MainData() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
