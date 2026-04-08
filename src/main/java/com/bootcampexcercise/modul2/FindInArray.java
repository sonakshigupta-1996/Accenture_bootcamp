package com.bootcampexcercise.modul2;

public class FindInArray {
    public static void main(String[] args) {
        // Step 1: Create array of 20 numbers
        int[] arr = {
                12, 45, 7, 89, 23, 56, 90, 11, 34, 67,
                78, 2, 99, 54, 31, 22, 10, 5, 88, 60
        };

        // Step 2: Assume first element is largest
        int largest = arr[0];

        // Step 3: Loop through array using index
        for (int i = 1; i < arr.length; i++) {

            // Step 4: Compare current element with largest
            if (arr[i] > largest) {
                largest = arr[i]; // update largest
            }
        }

        // Step 5: Print result
        System.out.println("Largest number: " + largest);
    }

}
