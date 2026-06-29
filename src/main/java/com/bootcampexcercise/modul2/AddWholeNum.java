package com.bootcampexcercise.modul2;

public class AddWholeNum {
    public static void main(String[] args) {
        int sum = 0;
// using for loop to add numbers between 50 to 100
        for (int i = 50; i <= 100; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}
