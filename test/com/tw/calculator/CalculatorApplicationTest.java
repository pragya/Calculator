package com.tw.calculator;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class CalculatorApplicationTest {

    @Test
    public void shouldDelegateToCalculatorController() {
        CalculatorController calculatorController = mock(CalculatorController.class);
        doNothing().when(calculatorController).start();
        calculatorController.start();

        verify(calculatorController).start();
    }
}