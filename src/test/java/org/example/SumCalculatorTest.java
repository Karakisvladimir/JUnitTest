package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    SumCalculator sumCalculator;

    @BeforeEach
    public void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testSumOne() {
        int result = sumCalculator.sum(1);
        assertEquals(1, result);
    }

    @Test
    public void testSumThree() {
        int result = sumCalculator.sum(3);
        assertEquals(6, result);
    }


    @Test
    public void testSumZeroException() throws IllegalArgumentException {
        int sum = sumCalculator.sum(0);
        if (sum == 0) {
            System.out.println("IllegalArgumentException");
        }

    }


}