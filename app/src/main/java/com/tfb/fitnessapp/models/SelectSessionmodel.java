package com.tfb.fitnessapp.models;

public class SelectSessionmodel {

    private int trainerimg;
    private String session_name;
    private String yogaName;
    private String sessionTime;
    private String trainerName;

    public SelectSessionmodel(int trainerimg, String session_name, String yogaName, String sessionTime, String trainerName) {
        this.trainerimg = trainerimg;
        this.session_name = session_name;
        this.yogaName = yogaName;
        this.sessionTime = sessionTime;
        this.trainerName = trainerName;
    }

    public int getTrainerimg() {
        return trainerimg;
    }

    public void setTrainerimg(int trainerimg) {
        this.trainerimg = trainerimg;
    }

    public String getSession_name() {
        return session_name;
    }

    public void setSession_name(String session_name) {
        this.session_name = session_name;
    }

    public String getYogaName() {
        return yogaName;
    }

    public void setYogaName(String yogaName) {
        this.yogaName = yogaName;
    }

    public String getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(String sessionTime) {
        this.sessionTime = sessionTime;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }
}
