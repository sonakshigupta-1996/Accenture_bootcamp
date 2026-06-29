package com.bootcampexcercise.module5;

public class Employee_I extends Person_I {

    // Additional attributes
    private String title;
    private int salary;

    // Default constructor
    public Employee_I() {
    }

    // Constructor with parameters
    public Employee_I(String name, int age, String title, int salary) {
        super(name, age); // call parent constructor
        this.title = title;
        this.salary = salary;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for salary
    public int getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
