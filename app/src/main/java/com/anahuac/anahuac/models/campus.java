package com.anahuac.anahuac.models;

public class campus {
    private String name;
    private int image;

    public campus (String name, int image){
        this.image = image;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
