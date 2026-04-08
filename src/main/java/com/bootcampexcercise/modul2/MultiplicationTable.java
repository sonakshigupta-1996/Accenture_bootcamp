package com.bootcampexcercise.modul2;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 11; i <= 20; i++) {   // outer loop (tables)

            System.out.println("Table of " + i);

            for (int j = 1; j <= 10; j++) {   // inner loop (multiples)
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); // space between tables
        }
    }
}
