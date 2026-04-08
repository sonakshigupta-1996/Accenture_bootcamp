package com.bootcampexcercise.module5;

public class Person_I {

    // Attributes
    private String name;
    private int age;

    // Default constructor
    public Person_I() {
    }

// Constructor with parameters
public Person_I(String name, int age) {
    this.name = name;
    this.age = age;
}

// Getter for name
public String getName() {
    return name;
}

// Setter for name
public void setName(String name) {
    this.name = name;
}

// Getter for age
public int getAge() {
    return age;
}

// Setter for age
public void setAge(int age) {
    this.age = age;
}
}