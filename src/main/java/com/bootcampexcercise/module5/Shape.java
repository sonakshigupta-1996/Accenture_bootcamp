package com.bootcampexcercise.module5;



// Abstract class
public abstract class Shape {

    public String color;

    public Shape() {
    }

    // Abstract methods (no body)
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }
}
