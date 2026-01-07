package com.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    int[] arr;
    void prepareInput(){
      arr = new int[3];
      arr[0] = 1;
      arr[1] = 2;
      arr[2] = 3;
    }

    @Test
    void whenInputsArePositive_thenReturnsPositive(){
        int a = 5;
        int b = 10;
        int expectedOutput = 15;

        int actualOutput = calculator.add(a,b);

        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void whenAIsGreaterthanB_thenReturnPositive(){
        int a = 15;
        int b = 10;
        int expectedOutput = 5;
        int actualOutput = calculator.subtract(a,b);
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void whenBIsGreaterThanA_thenShouldReturnNegative(){
        int a = 5;
        int b = 8;
        int expectedOutput = -3;
        int actualOutput = calculator.subtract(a,b);
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void whenOutputIsPositive_thenMultiplyItAndReturnPositive(){
        int a = 15;
        int b = 10;
        int expectedOutput = 150;
        int actualOutput = calculator.multiply(a,b);
        Assertions.assertEquals(expectedOutput,actualOutput);
    }


    @Test
    void whenAIsGreaterThanB_thenReturnPositive(){
        int a = 50;
        int b = 10;
        int expectedOutput = 5;
        int actualOutput = calculator.divide(a,b);
        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void whenDivideByZero_shouldReturnThrowException(){
        int a = 1;
        int b = 0;
        Assertions.assertThrows(ArithmeticException.class, ()-> {
            calculator.divide(a,b);
        });
    }


    @Test
    void whenOutputIEven_thenReturnTrue(){
        int a = 10;
        boolean actualOutput = calculator.isEven(a);
        Assertions.assertTrue(actualOutput);
    }

    @Test
    void whenOutputIOdd_thenReturnFalse(){
        int a = 11;
        boolean actualOutput = calculator.isEven(a);
        Assertions.assertFalse(actualOutput);
    }
}
