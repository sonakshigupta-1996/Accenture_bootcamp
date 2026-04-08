package com.bootcampexcercise.module3;

public class Car {
    // Attributes
    private String name;
    private String color;
    private int modelNo;

    // Default constructor
    public Car() {
    }

    // Constructor with 1 parameter
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

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }
    public static void main(String[] args) {

        // Print 1: Only 1 car name
        Car car1 = new Car("BMW");
        System.out.println("Car Name: " + car1.getName());

        // Print 2: Car with 3 attributes
        Car car2 = new Car("Audi", "White", 2022);

        System.out.println("Car Details:");
        System.out.println("Name: " + car2.getName());
        System.out.println("Color: " + car2.getColor());
        System.out.println("Model No: " + car2.getModelNo());
    }

}

