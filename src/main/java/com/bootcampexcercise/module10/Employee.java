package com.bootcampexcercise.module10;
import java.util.*;
public class Employee extends Person {
    private String jobTitle;
    private String company;
    private double salary;

    // Constructors
    public Employee() {
    }
   public Employee(String name, int age,String jobTitle, String company,double salary){
        setName(name);
        setAge(age);
        this.jobTitle= jobTitle;
        this.company= company;
        this.salary= salary;
   }

   //add Getter and Setter
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //Override introduce method

    @Override
    public void introduce() {
        System.out.println("My name is "+getName()+" and I am "+getAge()+ " years old");
        System.out.println("I work as "+jobTitle+" in "+company+ " and my salary is "+salary);
    }
    //Methods which returns the name of the employee whose salary is highest among the 5

    public String getHighestPaidEmp(List<Employee> empList) {
        if (empList == null || empList.isEmpty()) {
            return "No employees found";
        }

        Employee highestPaid = empList.get(0);
        for (Employee e : empList) {
            if (e.getSalary() > highestPaid.getSalary()) {
                highestPaid = e;
            }
        }
        return highestPaid.getName();
    }
}