package com.bootcampexcercise.module10;
import java.util.*;

public class EmployeeList {
    public static void main(String[] args) {
        //Create 5 employees objects using constructor
        Employee emp1= new Employee("Sonakshi",30,"Tester","Accenture",2000);
        Employee emp2= new Employee("Amit",35,"Developer","Accenture",3500);
        Employee emp3= new Employee("Sona",28,"Designer","Google",1300);
        Employee emp4= new Employee("Alice",30,"Intern","Microsoft",500);
        Employee emp5= new Employee("Charlie",45,"Director","Accenture",85000);

        //Create list and add all employess
        List<Employee> empList= new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        //Print the statement
        String highestPaidName = emp1.getHighestPaidEmp(empList);
        System.out.println("The Employee whose salary is the highest is: "+highestPaidName);
    }
}
/* Output is:
The Employee whose salary is the highest is: Charlie
*/
