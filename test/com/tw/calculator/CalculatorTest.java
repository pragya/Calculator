package com.tw.calculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldAddToAccumulatorValueWhichIsZeroAndResultInThatNumber() {
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
    public void shouldSubtractFromAccumulatorValueWhichIsZeroAndResultNegativeNumber() {
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
    public void shouldMultiplyAccumulatorValueWhichIsZeroAndResultZero() {
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
    public void shouldDivideAccumulatorValueWhichIsZeroAndResultZero() {
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
    public void shouldSquarePreviousValueOfAccumulator() {
        Calculator calculator = new Calculator(2);
        calculator.sqr(0);
        assertEquals(calculator.getAccumulator(), 4.0, 0.0000);
    }

    @Test
    public void shouldSquareRootPreviousValueOfAccumulator() {
        Calculator calculator = new Calculator(25);
        calculator.sqrt(0);
        assertEquals(calculator.getAccumulator(), 5.0, 0.0000);
    }

    @Test
    public void shouldReturnNegativePreviousValueOfAccumulator() {
        Calculator calculator = new Calculator(25);
        calculator.neg(0);
        assertEquals(calculator.getAccumulator(), -25.0, 0.0000);
    }

    @Test
    public void shouldReturnPositiveValueIfPreviousValueOfAccumulatorIsNegative() {
        Calculator calculator = new Calculator(-25);
        calculator.neg(0);
        assertEquals(calculator.getAccumulator(), 25.0, 0.0000);
    }

    @Test
    public void shouldReturnPositiveValueAccumulator() {
        Calculator calculator = new Calculator(-25);
        calculator.abs(0);
        assertEquals(calculator.getAccumulator(), 25.0, 0.0000);
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