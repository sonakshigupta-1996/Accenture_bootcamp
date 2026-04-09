package com.bootcampexcercise.module5;

public class AbstractActivity {

    public static void main(String args[]) {

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Red");

        System.out.println("Rectangle Color: " + rectangle.getColor());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("-------------------");

        Circle circle = new Circle();
        circle.setColor("Blue");

        System.out.println("Circle Color: " + circle.getColor());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}

/* Output is:
Rectangle Color: Red
Area: 15.0
Perimeter: 16.0
-------------------
Circle Color: Blue
Area: 50.26548245743669
Perimeter: 25.132741228718345
 */
