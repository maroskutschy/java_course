package com.ness;

import java.util.Locale;

public class Car {

    // state
    private int doors;
    private int wheels;
    public String model;
    private String engine;
    private String colour;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera")|| validModel.equals("holden")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
       return this.model;
    }

}
