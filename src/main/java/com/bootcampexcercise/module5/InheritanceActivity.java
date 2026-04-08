package com.bootcampexcercise.module5;

public class InheritanceActivity {
    public static void main(String[] args) {

        // Create Person object
        // Set name as Sarah Johnson and age as 21
        Person_I myPerson = new Person_I("Sarah Johnson", 21);

        // Print Person details
        System.out.println("Person Info:");
        System.out.println("Name: " + myPerson.getName());
        System.out.println("Age: " + myPerson.getAge());

        System.out.println("-------------------------");

        // Create Employee object
        // Set salary as 70000, title as Developer, age as 32 and name as Shawn Cun
        Employee_I myEmployee = new Employee_I("Shawn Cun", 32, "Developer", 70000);

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

