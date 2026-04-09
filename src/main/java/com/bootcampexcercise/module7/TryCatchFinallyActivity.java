package com.bootcampexcercise.module7;

public class TryCatchFinallyActivity {
    public static void main(String[] args) {

        // Call method
        TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
        obj.catchMeIfYouCan();
    }

    void catchMeIfYouCan() {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // try block
        try {

            // i <= 10 will cause error (array size is 10 → last index is 9)
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }

        } catch (IndexOutOfBoundsException e) {

            // custom message
            System.out.println("Exception occurred: Array index is out of bounds!");

        } finally {

            // always executes
            System.out.println("Finally block executed (runs always)");
        }
    }
}

/* Output is:
0
1
2
3
4
5
6
7
8
9
Exception occurred: Array index is out of bounds!
Finally block executed (runs always)
*/
