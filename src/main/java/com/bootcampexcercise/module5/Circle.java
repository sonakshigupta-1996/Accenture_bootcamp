package com.bootcampexcercise.module5;

public class Circle extends Shape {

    double radius ;
    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // Area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Perimeter
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

}
