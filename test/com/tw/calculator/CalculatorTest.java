package com.tw.calculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldAddToGivenValueOfAccumulator() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        assertEquals(calculator.getAccumulator(), 5, 0.0000);
    }

    @Test
    public void shouldAddToPreviousValueOfAccumulator() {
        Calculator calculator = new Calculator(10);
        calculator.add(5);
        assertEquals(calculator.getAccumulator(), 15, 0.0000);
    }

    @Test
    public void shouldSubtractFromGivenValueOfAccumulator() {
        Calculator calculator = new Calculator();
        calculator.subtract(5);
        assertEquals(calculator.getAccumulator(), -5, 0.0000);
    }

    @Test
    public void shouldSubtractFromPreviousValueOfAccumulator() {
        Calculator calculator = new Calculator(10);
        calculator.subtract(5);
        assertEquals(calculator.getAccumulator(), 5, 0.0000);
    }

    @Test
    public void shouldMuliplyToGivenValueOfAccumulator() {
        Calculator calculator = new Calculator();
        calculator.multiply(5);
        assertEquals(calculator.getAccumulator(), 0, 0.0000);
    }

    @Test
    public void shouldMultiplyFromPreviousValueOfAccumulator() {
        Calculator calculator = new Calculator(10);
        calculator.multiply(5);
        assertEquals(calculator.getAccumulator(), 50, 0.0000);
    }

    @Test
    public void shouldDivideAndReturnPreviousAccumulatorValueIfOperandIsZero() {
        Calculator calculator = new Calculator();
        calculator.divide(0);
        assertEquals(calculator.getAccumulator(), 0, 0.0000);
    }

    @Test
    public void shouldDivideGivenValueOfAccumulator() {
        Calculator calculator = new Calculator();
        calculator.divide(5);
        assertEquals(calculator.getAccumulator(), 0, 0.0000);
    }

    @Test
    public void shouldDividePreviousValueOfAccumulator() {
        Calculator calculator = new Calculator(10);
        calculator.divide(5);
        assertEquals(calculator.getAccumulator(), 2, 0.0000);
    }

    @Test
    public void shouldCancelPreviousValueOfAccumulator() {
        Calculator calculator = new Calculator();
        calculator.cancel(0);
        assertEquals(calculator.getAccumulator(), 0, 0.0000);
    }

    @Test
    public void shouldExitTheProgram() {
        exit.expectSystemExitWithStatus(0);
        Calculator calculator = new Calculator();
        calculator.exit(0);
    }
}