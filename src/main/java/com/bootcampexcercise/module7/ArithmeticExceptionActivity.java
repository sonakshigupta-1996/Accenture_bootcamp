package com.bootcampexcercise.module7;

public class ArithmeticExceptionActivity {
    // TODO: 1 - main method
    public static void main(String args[]) {

        // TODO: 2 - Create object and call catchMe with 10 and 0
        ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();
        obj.catchMe(10, 0);

        System.out.println("------------------");

        // TODO: 5 - Call with 10 and 2
        obj.catchMe(10, 2);
    }

    void catchMe(int num1, int num2) {

        try {
            // risky code (division)
            int result = num1 / num2;
            System.out.println("Result is: " + result);

        } catch (ArithmeticException a) {
            // handling division by zero
            System.out.println("Exception occurred: Cannot divide by zero!");

        } finally {
            // TODO: 4 - always executes
            System.out.println("Thank you for using this program.");
        }
    }
}
/* Output is:
Exception occurred: Cannot divide by zero!
Thank you for using this program.
------------------
Result is: 5
Thank you for using this program.
 */

