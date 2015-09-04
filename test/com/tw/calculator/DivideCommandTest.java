package com.tw.calculator;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DivideCommandTest {

    @Test
    public void shouldExecuteAddOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        DivideCommand divideCommand = new DivideCommand(calculator, 5);

        divideCommand.execute();
        verify(calculator).divide(5);
    }
}