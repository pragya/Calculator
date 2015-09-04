package com.tw.calculator;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AddCommandTest {

    @Test
    public void shouldExecuteAddOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        AddCommand addCommand = new AddCommand(calculator, 5);

        addCommand.execute();
        verify(calculator).add(5);
    }
}