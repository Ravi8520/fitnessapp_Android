package com.tfb.fitnessapp.models;

public class WorkExperiencemodel {

    String gymName;
    String workExperience;

    public WorkExperiencemodel(String gymName, String workExperience) {
        this.gymName = gymName;
        this.workExperience = workExperience;
    }

    public String getGymName() {
        return gymName;
    }

    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }
}
