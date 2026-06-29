package com.bootcampexcercise.module3;

public class Car {
    // Attributes
    private String name;
    private String color;
    private int modelNo;

    // Constructor with 1 parameter (only name)
    public Car(String name) {
        this.name = name;
    }

    // Constructor with all parameters
    public Car(String name, String color, int modelNo) {
        this.name = name;
        this.color = color;
        this.modelNo = modelNo;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getModelNo() {
        return modelNo;
    }
}

