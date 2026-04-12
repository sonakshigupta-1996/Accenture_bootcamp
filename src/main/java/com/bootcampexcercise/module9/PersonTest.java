package com.bootcampexcercise.module9;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() {
        person = new Person();
    }

    @After
    public void tearDown() {
        person = null;
    }

    @Test
    public void testSetAndGetWeight() {
        person.setWeight(70);
        assertEquals(70, person.getWeight());
    }

    @Test
    public void testSetAndGetHeight() {
        person.setHeight(1.75f);

        assertEquals(1.75f, person.getHeight(), 0.001f);
    }

    @Test
    public void testBMI_Normal() {
        String result = person.getBodyMassIndex(1.75f, 70);
        assertEquals("Normal", result);
    }

    @Test
    public void testBMI_Underweight() {
        String result = person.getBodyMassIndex(1.75f, 50);
        assertEquals("Underweight", result);
    }

    @Test
    public void testBMI_Invalid() {
        String result = person.getBodyMassIndex(0, 70);
        assertEquals("Invalid input", result);
    }

    @Test
    public void testBMI_InvalidRange() {
        String result = person.getBodyMassIndex(5, 500);
        assertEquals("Invalid range", result);
    }
}