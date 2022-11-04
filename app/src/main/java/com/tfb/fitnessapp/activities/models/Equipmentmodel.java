package com.tfb.fitnessapp.activities.models;

public class Equipmentmodel {

    private String title;
    private int imgid;

    public Equipmentmodel(String title, int imgid) {
        this.title = title;
        this.imgid = imgid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
