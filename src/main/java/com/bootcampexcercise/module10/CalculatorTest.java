package com.bootcampexcercise.module10;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.*;

public class CalculatorTest {
    private Calculator calc;
    @Before
    public void setUp() {
        calc = new Calculator();
    }

    //  Add method tests (4 cases)
    @Test
    public void testAddInts() {
        assertEquals(10, calc.add(5, 5));
    }

    @Test
    public void testAddIntsNegative() {
        assertEquals(0, calc.add(5, -5));
    }

    @Test
    public void testAddThreeNumbers() {
        assertEquals(10.5, calc.add(5, 5, 8), 0.001);
    }

    @Test
    public void testAddZeros() {
        assertEquals(0, calc.add(0, 0), 0.0);
    }

    //  Subtract method tests (2 cases)
    @Test
    public void testSubtract() {
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    public void testSubtractNegative() {
        assertEquals(15, calc.subtract(10, -5));
    }

    // Divide method tests (2 cases)
    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        // Based on our try-catch, it returns 0 on failure
        assertEquals(0, calc.divide(10, 0));
    }

    // Multiply method tests (2 cases)
    @Test
    public void testMultiply() {
        assertEquals(20, calc.multiply(4, 5));
    }

    @Test
    public void testMultiplyCustomException() {
        // Triggering the custom exception
        assertEquals(0, calc.multiply(-2, 5));
    }
}
