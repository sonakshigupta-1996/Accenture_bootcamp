package com.bootcampexcercise.module3;

public class Calculator {

    // Step 1: Constant
    public static final String CALC_TYPE_BASIC = "BASIC";

    // Step 2: Variable
    private String calculatorType;

    // Step 3: Constructor
    public Calculator(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // Step 4: Getter
    public String getCalculatorType() {
        return calculatorType;
    }

    // Step 5: Add method
    public int add(int a, int b) {
        return a + b;
    }

    // Step 6: Multiply
    public int multiply(int[] numbers) {
        int result = 1;

        for (int i = 0; i < numbers.length; i++) {
            result = result * numbers[i];
        }

        return result;
    }

    // Step 7: Divide
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }

    // Step 8: Subtract
    public int subtract(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {

        // Create object
        Calculator calc = new Calculator(CALC_TYPE_BASIC);

        System.out.println("Testing Calculator:");

        // Add
        int result = calc.add(4, 5);
        System.out.println("Add result = " + result);

        // Multiply
        int[] mul = {2, 3, 4};
        result = calc.multiply(mul);
        System.out.println("Multiply result = " + result);

        // Divide
        result = calc.divide(10, 2);
        System.out.println("Divide result = " + result);

        // Subtract
        result = calc.subtract(10, 2);
        System.out.println("Subtract result = " + result);
    }
}

