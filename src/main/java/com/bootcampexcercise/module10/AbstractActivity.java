package com.bootcampexcercise.module10;

public class AbstractActivity {
    public static void main(String[] args) {
        //Call introduce method from Employee
        Employee emp = new Employee("Sonakshi",30,"Testing Automation","Accenture",2000);
        emp.introduce();

        //Call introduce method from Student
        Student stu = new Student();
        stu.setName("Sona");
        stu.setAge(25);
        stu.setSchoolName("XYZ University");
        stu.introduce();
    }
}
/* Output is:
My name is Sonakshi and I am 30 years old
I work as Testing Automation in Accenture and my salary is 2000.0
My name is Sona and I am 25 years old
I study in university XYZ University
*/
