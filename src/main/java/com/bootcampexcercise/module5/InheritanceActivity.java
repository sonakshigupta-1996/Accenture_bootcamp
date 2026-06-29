package com.bootcampexcercise.module5;

public class InheritanceActivity {
    public static void main(String[] args) {

        // Create Person object
        // Set name as Sarah Johnson and age as 21
        Person_I myPerson = new Person_I("Sonakshi", 30);

        // Print Person details
        System.out.println("Person Info:");
        System.out.println("Name: " + myPerson.getName());
        System.out.println("Age: " + myPerson.getAge());

        System.out.println("-------------------------");

        // Create Employee object
        // Set salary as 70000, title as Developer, age as 32 and name as Shawn Cun
        Employee_I myEmployee = new Employee_I("Micky", 32, "Developer", 2000);

        // Print Employee details
        System.out.println("Employee Info:");
        System.out.println("Name: " + myEmployee.getName());
        System.out.println("Age: " + myEmployee.getAge());
        System.out.println("Title: " + myEmployee.getTitle());
        System.out.println("Salary: " + myEmployee.getSalary());

        System.out.println("-------------------------");

        // Print Person info again (as mentioned)
        System.out.println("Person Info Again:");
        System.out.println("Name: " + myPerson.getName());
        System.out.println("Age: " + myPerson.getAge());
    }
}
/* Output is:
Person Info:
Name: Sonakshi
Age: 30
-------------------------
Employee Info:
Name: Micky
Age: 32
Title: Developer
Salary: 2000
-------------------------
Person Info Again:
Name: Sonakshi
Age: 30
*/
