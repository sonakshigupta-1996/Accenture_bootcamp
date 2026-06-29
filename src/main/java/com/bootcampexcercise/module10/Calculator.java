package com.bootcampexcercise.module10;

public class Calculator {
    //Method Overloading
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    //Subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    //Divide method with exception handling
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero!");
            return 0;
        }
    }

    //Multiply method with customized exception
    public int multiply(int a, int b) {
        try {
            if (a < 0 || b < 0) {
                throw new Exception("Negative numbers are not allowed!");
            }
            return a * b;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
