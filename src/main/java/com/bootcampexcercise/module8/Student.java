package com.bootcampexcercise.module8;

public class Student {
    //  Attributes
    private int id;
    private String name;
    private double grade;

    // Constructor
    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    //Print method
    public void printStudent() {
        System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);
    }
}
