package com.company;

public class Car {
    // add fields/ state of the car.
    // Then create this car object in the main method
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("rs3 quatro") || validModel.equals("stronic")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
