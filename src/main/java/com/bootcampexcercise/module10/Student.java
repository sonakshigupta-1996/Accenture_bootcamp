package com.bootcampexcercise.module10;

public class Student extends Person{
    private String schoolName;

    //Add Getter and Setter

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    //Override introduce method

    @Override
    public void introduce() {
        System.out.println("My name is "+getName()+" and I am "+getAge()+ " years old");
        System.out.println("I study in university "+schoolName);
    }
}
