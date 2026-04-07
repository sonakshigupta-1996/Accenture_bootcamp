package com.bootcampexcercise.modul2;

public class NumToWords {
    public static void main(String[] args) {
        switchCase(5);
        switchCase(100); // Variation for default section execution
        switchCase(1);
    }

    /**
     * Method
     * @param num
     */
    public static void switchCase(int num) {

        switch (num) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;

            default:
                System.out.println("Given value is not in the range 1-10");
        }
    }
}
