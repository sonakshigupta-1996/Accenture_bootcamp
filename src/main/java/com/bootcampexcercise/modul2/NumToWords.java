package com.bootcampexcercise.modul2;

public class NumToWords {
    // Method 1: main method
    public static void main(String[] args) {
        // Calling method with 3 values
        switchCase(5); // should print FIVE
        switchCase(100); // should go to default
        switchCase(1); // should print ONE
    }

    // Method 2: switch logic method
    public static void switchCase(int num) {

        switch (num) {
            case 1:
                System.out.println("ONE"); // statements here
                break;
            case 2:
                System.out.println("TWO"); // statements here
                break;
            case 3:
                System.out.println("THREE"); // statements here
                break;
            case 4:
                System.out.println("FOUR"); // statements here
                break;
            case 5:
                System.out.println("FIVE"); // statements here
                break;
            case 6:
                System.out.println("SIX"); // statements here
                break;
            case 7:
                System.out.println("SEVEN"); // statements here
                break;
            case 8:
                System.out.println("EIGHT"); // statements here
                break;
            case 9:
                System.out.println("NINE"); // statements here
                break;
            case 10:
                System.out.println("TEN"); // statements here
                break;

            default:
                System.out.println("Given value is not in the range 1-10");
        }
    }
}
