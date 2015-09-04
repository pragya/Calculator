package com.tw.calculator;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SubtractCommandTest {

    @Test
    public void shouldExecuteAddOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        SubtractCommand subtractCommand = new SubtractCommand(calculator, 1);

        subtractCommand.execute();
        verify(calculator).subtract(1);
    }
}