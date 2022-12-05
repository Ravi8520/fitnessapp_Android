package com.tfb.fitnessapp.models;

public class Clientsmodel {

    private int img;
    private String session_user;
    private String user_address;
    private String fitness_type;
    private String selected_plan;


    public Clientsmodel(int img, String session_user, String user_address, String fitness_type, String selected_plan) {
        this.img = img;
        this.session_user = session_user;
        this.user_address = user_address;
        this.fitness_type = fitness_type;
        this.selected_plan = selected_plan;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getSession_user() {
        return session_user;
    }

    public void setSession_user(String session_user) {
        this.session_user = session_user;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getFitness_type() {
        return fitness_type;
    }

    public void setFitness_type(String fitness_type) {
        this.fitness_type = fitness_type;
    }

    public String getSelected_plan() {
        return selected_plan;
    }

    public void setSelected_plan(String selected_plan) {
        this.selected_plan = selected_plan;
    }
}
