package com.tfb.fitnessapp.activities.models;

public class WorkoutProgramsmodel {

    private String program;
    private String calary_count;

    public WorkoutProgramsmodel(String program, String calary_count) {
        this.program = program;
        this.calary_count = calary_count;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getCalary_count() {
        return calary_count;
    }

    public void setCalary_count(String calary_count) {
        this.calary_count = calary_count;
    }
}
