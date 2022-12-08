package com.tfb.fitnessapp.models;

public class Bookingmodel {

    private String excerciseName;
    private String caloriesBurn;

    public Bookingmodel(String excerciseName, String caloriesBurn) {
        this.excerciseName = excerciseName;
        this.caloriesBurn = caloriesBurn;
    }

    public String getExcerciseName() {
        return excerciseName;
    }

    public void setExcerciseName(String excerciseName) {
        this.excerciseName = excerciseName;
    }

    public String getCaloriesBurn() {
        return caloriesBurn;
    }

    public void setCaloriesBurn(String caloriesBurn) {
        this.caloriesBurn = caloriesBurn;
    }
}
