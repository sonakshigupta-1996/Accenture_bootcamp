package com.bootcampexcercise.module3;

public class Calculator {

    // Constant
    public static final String CALC_TYPE_BASIC = "BASIC";

    // Variable
    private String calculatorType;

    // Constructor
    public Calculator(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // Getter
    public String getCalculatorType() {
        return calculatorType;
    }

    // Add
    public int add(int a, int b) {
        return a + b;
    }

    // Multiply (array)
    public int multiply(int[] numbers) {
        int result = 1;
        for (int i = 0; i < numbers.length; i++) {
            result = result * numbers[i];
        }
        return result;
    }

    // Divide
    public int divide(int a, int b) {
        return a / b;
    }

    // Subtract
    public int subtract(int a, int b) {
        return a - b;
    }
}


