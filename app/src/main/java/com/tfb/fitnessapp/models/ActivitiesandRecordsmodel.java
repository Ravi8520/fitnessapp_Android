package com.tfb.fitnessapp.models;

public class ActivitiesandRecordsmodel {

    private String month;
    private String date;
    private String recentexcercises;
    private String excercises;

    public ActivitiesandRecordsmodel(String month, String date, String recentexcercises, String excercises) {
        this.month = month;
        this.date = date;
        this.recentexcercises = recentexcercises;
        this.excercises = excercises;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRecentexcercises() {
        return recentexcercises;
    }

    public void setRecentexcercises(String recentexcercises) {
        this.recentexcercises = recentexcercises;
    }

    public String getExcercises() {
        return excercises;
    }

    public void setExcercises(String excercises) {
        this.excercises = excercises;
    }
}
