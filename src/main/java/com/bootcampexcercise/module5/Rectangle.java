package com.bootcampexcercise.module5;

public class Rectangle extends Shape {

    // Attributes
    private double length;
    private double breadth;
    // Setter methods
    public void setLength(double length) {
        this.length = length;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    // Area
    public double calculateArea() {
        return length * breadth;
    }

    // Perimeter
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}



