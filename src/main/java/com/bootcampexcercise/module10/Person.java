package com.bootcampexcercise.module10;

public abstract class Person {
    // Attributes
    private String name;
    private  int age;

    // Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // Introduce method
    public void introduce(){
        System.out.println("My name is "+name + "and I am "+age + " years old");
    }
}
