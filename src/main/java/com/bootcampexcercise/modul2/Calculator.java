package com.bootcampexcercise.modul2;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Call all methods
        // I can also call any one method
        sum(a, b);
        subtract(a, b);
        multiply(a, b);
        divide(a, b);
        modulus(a, b);
    }

    // Method 1
    public static void sum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // Method 2
    public static void subtract(int a, int b) {
        System.out.println("Subtract = " + (a - b));
    }

    // Method 3
    public static void multiply(int a, int b) {
        System.out.println("Multiply = " + (a * b));
    }

    // Method 4
    public static void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Divide = " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    // Method 5
    public static void modulus(int a, int b) {
        System.out.println("Modulus = " + (a % b));
    }
}