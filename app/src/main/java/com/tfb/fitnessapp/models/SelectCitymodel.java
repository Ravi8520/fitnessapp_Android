package com.tfb.fitnessapp.models;

public class SelectCitymodel {

    private String cityname;

    public SelectCitymodel(String cityname) {
        this.cityname = cityname;
    }

    public String getCity() {
        return cityname;
    }

    public void setCity(String cityname) {
        this.cityname = cityname;
    }
}
