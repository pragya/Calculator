package com.tw.calculator;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class NullCommandTest {

    @Test
    public void shouldExecuteAddOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        NullCommand nullCommand = new NullCommand(calculator, commandHistory, 5);

        nullCommand.execute();
        verifyZeroInteractions(calculator);
    }
}