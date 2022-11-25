package com.tfb.fitnessapp.models;

public class MySchedulemodel {

    private String username;
    private String experience;
    private String mapAddress;
    private String exerciseType;
    private String slotTime;
    private String date;
    private int imgid;

    public MySchedulemodel(String username, String experience,
                           String mapAddress, String exerciseType, String slotTime, String date, int imgid) {
        this.username = username;
        this.experience = experience;
        this.mapAddress = mapAddress;
        this.exerciseType = exerciseType;
        this.slotTime = slotTime;
        this.date = date;
        this.imgid = imgid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getMapAddress() {
        return mapAddress;
    }

    public void setMapAddress(String mapAddress) {
        this.mapAddress = mapAddress;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }

    public String getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(String slotTime) {
        this.slotTime = slotTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
