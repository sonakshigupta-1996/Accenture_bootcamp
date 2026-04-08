package com.bootcampexcercise.module5;

public class Rectangle extends Shape {

    // Attributes
    private double length = 5;
    private double width = 3;

    // Implement area
    public double calculateArea() {
        return length * width;
    }

    // Implement perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}