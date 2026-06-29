package com.bootcampexcercise.module5;

public class AbstractActivity {

    public static void main(String args[]) {

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Red");
        rectangle.setLength(20);
        rectangle.setBreadth(30);

        System.out.println("Rectangle Color: " + rectangle.getColor());
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Perimeter: " + rectangle.calculatePerimeter());

        Circle circle = new Circle();
        circle.setColor("Blue");
        circle.setRadius(5);

        System.out.println("Circle Color: " + circle.getColor());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}

/* Output is:
Rectangle Color: Red
Area of rectangle: 600.0
Area of Perimeter: 100.0
Circle Color: Blue
Area: 78.53981633974483
Perimeter: 31.41592653589793
 */
