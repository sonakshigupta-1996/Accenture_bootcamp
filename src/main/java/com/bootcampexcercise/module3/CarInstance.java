package com.bootcampexcercise.module3;

public class CarInstance {
    public static void main(String[] args) {

        // Print 1: Only name
        Car car1 = new Car("BMW");
        System.out.println("Car Name: " + car1.getName());

        System.out.println("------------------");

        // Print 2: All attributes
        Car car2 = new Car("Audi", "Black", 2024);

        System.out.println("Car Name: " + car2.getName());
        System.out.println("Car Color: " + car2.getColor());
        System.out.println("Car Model No: " + car2.getModelNo());
    }
}
