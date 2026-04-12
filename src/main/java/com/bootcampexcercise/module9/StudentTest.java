package com.bootcampexcercise.module9;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.*;

public class StudentTest {

    private ArrayList<String> studentList;

    @Before
    public void setUp() {
        // Initialize the list before each test to ensure a clean state
        studentList = new ArrayList<>();
    }

    @After
    public void tearDown() {
        studentList = null;
    }

    //  Test adding a student and checking the size
    @Test
    public void testAddStudent() {
        studentList.add("Sonakshi Gupta");
        assertEquals("List size should be 1 after adding a student", 1, studentList.size());
    }

    // Test if the list contains a specific added student
    @Test
    public void testStudentExists() {
        studentList.add("Amit");
        assertTrue("The list should contain Amit", studentList.contains("Amit"));
    }

    //  Test removing a student
    @Test
    public void testRemoveStudent() {
        studentList.add("Alice");
        studentList.add("Bob");
        studentList.remove("Alice");

        assertEquals("List size should be 1 after removal", 1, studentList.size());
        assertFalse("Alice should no longer be in the list", studentList.contains("Alice"));
    }

    // 4. Test clearing the list
    @Test
    public void testClearList() {
        studentList.add("Student 1");
        studentList.add("Student 2");
        studentList.clear();

        assertTrue("List should be empty after clear()", studentList.isEmpty());
        assertEquals(0, studentList.size());
    }

    // 5. Test finding the index of a student
    @Test
    public void testGetStudentIndex() {
        studentList.add("First Student");
        studentList.add("Second Student");

        int index = studentList.indexOf("Second Student");
        assertEquals("Second Student should be at index 1", 1, index);
    }
}
