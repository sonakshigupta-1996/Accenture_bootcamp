package com.bootcampexcercise.module5;

public class Circle extends Shape {

    double radius = 4;

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
