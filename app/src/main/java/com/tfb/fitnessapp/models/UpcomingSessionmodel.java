package com.tfb.fitnessapp.models;

public class UpcomingSessionmodel {

    private String name;
    private String session_Type;
    private String session_time;
    private String address;
    private String session_date;
    private int imgid;

    public UpcomingSessionmodel(String name, String session_Type, String session_time,
                                String address, String session_date, int imgid) {
        this.name = name;
        this.session_Type = session_Type;
        this.session_time = session_time;
        this.address = address;
        this.session_date = session_date;
        this.imgid = imgid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSession_Type() {
        return session_Type;
    }

    public void setSession_Type(String session_Type) {
        this.session_Type = session_Type;
    }

    public String getSession_time() {
        return session_time;
    }

    public void setSession_time(String session_time) {
        this.session_time = session_time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSession_date() {
        return session_date;
    }

    public void setSession_date(String session_date) {
        this.session_date = session_date;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
