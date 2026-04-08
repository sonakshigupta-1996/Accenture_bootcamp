package com.bootcampexcercise.modul2;

public class FindLargest {
    public static void main(String[] args) {
        // Step 1: Declare three numbers
        int x = 10;
        int y = 89;
        int z = 2;
        // Step 2: Check if x is largest
        if (x >= y && x >= z) {
            System.out.println("Largest value is: " + x);

            // Step 3: Check if y is largest
        } else if (y >= x && y >= z) {
            System.out.println("Largest value is: " + y);

            // Step 4: Otherwise z is largest
        } else {
            System.out.println("Largest value is: " + z);
        }
    }
}
