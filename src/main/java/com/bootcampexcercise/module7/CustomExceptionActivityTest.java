package com.bootcampexcercise.module7;

public class CustomExceptionActivityTest {
    // 1 - main method
    public static void main(String[] args) {

        CustomExceptionActivityTest obj = new CustomExceptionActivityTest();

        // Call method with different names
        try {
            obj.validateUser("John");     // valid
            obj.validateUser("Mike");     // valid
            obj.validateUser("Alex");     // invalid
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }
    }

    void validateUser(String name) throws CustomExceptionActivity {

        // array of valid users
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

        // flag = 0 means not found
        int flag = 0;

        for (int i = 0; i < validUsers.length; i++) {

            // 2 - check if name matches array value
            if (name.equals(validUsers[i])) {
                flag = 1; // found
                break;
            }
        }

        // 3 - if not found → throw exception
        if (flag == 0) {
            throw new CustomExceptionActivity();
        }

        // 4 - if found → print welcome message
        else {
            System.out.println("Welcome to Payroll program");
        }
    }
}

/* Output is:
Welcome to Payroll program
Welcome to Payroll program
You are not allowed to use this program
 */