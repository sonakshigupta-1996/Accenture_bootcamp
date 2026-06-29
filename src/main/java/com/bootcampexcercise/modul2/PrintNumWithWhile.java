package com.bootcampexcercise.modul2;

public class PrintNumWithWhile {
    public static void main(String[] args) {
        int i = 1; // start from first odd number

        while (i < 100) {
            System.out.println(i);
            i += 2; // move to next odd number
        }
    }
}
