package com.tw.calculator;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MultiplyCommandTest {

    @Test
    public void shouldExecuteAddOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        MultiplyCommand multiplyCommand = new MultiplyCommand(calculator, 5);

        multiplyCommand.execute();
        verify(calculator).multiply(5);
    }
}