package com.bootcampexcercise.modul2;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // Step 1: Create Scanner object to take input
        Scanner sc = new Scanner(System.in);
        // Step 2: Ask user to enter first number
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        // Step 3: Ask user to enter second number
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

    // Define Method 1
    public static void sum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // Define Method 2
    public static void subtract(int a, int b) {
        System.out.println("Subtract = " + (a - b));
    }

    // Define Method 3
    public static void multiply(int a, int b) {
        System.out.println("Multiply = " + (a * b));
    }

    // Define Method 4
    public static void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Divide = " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    // Define Method 5
    public static void modulus(int a, int b) {
        System.out.println("Modulus = " + (a % b));
    }
}