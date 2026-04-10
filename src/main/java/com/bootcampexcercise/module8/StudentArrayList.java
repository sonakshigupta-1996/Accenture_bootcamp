package com.bootcampexcercise.module8;
import java.util.*;
public class StudentArrayList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        //create students
        Student s1 = new Student(1, "John", 85);
        Student s2 = new Student(2, "Mike", 90);
        Student s3 = new Student(3, "Sona", 50);
        Student s4 = new Student(4, "Amit", 99);

        //add students in list
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        // Print all students
        System.out.println("All Students:");
        printStudents(students);


        // Remove student with ID = 3
        students.removeIf(s -> s.getId() == 3);

        // Print after removal
        System.out.println("\nAfter removing ID 3:");
        printStudents(students);

        // Find highest grade student
        Optional<Student> std = students.stream()
                .max(Comparator.comparing(Student::getGrade));


        System.out.println("\nHighest Grade Student:"+std.get().getName());
    }

   /* private static void removeDuplicatesById(ArrayList<Student> students) {
        students.stream().distinct(Student::getId).toList();
    }*/

    private static void printStudents(ArrayList<Student> students) {
        students.forEach(s -> {
            System.out.println("id: " + s.getId() + " --name: " + s.getName() + " --grade: " + s.getGrade());
        });
    }

}
/* Output is:
All Students:
id: 1 --name: John --grade: 85.0
id: 2 --name: Mike --grade: 90.0
id: 3 --name: Sona --grade: 50.0
id: 4 --name: Amit --grade: 99.0

After removing ID 3:
id: 1 --name: John --grade: 85.0
id: 2 --name: Mike --grade: 90.0
id: 4 --name: Amit --grade: 99.0

Highest Grade Student:Amit

 */
