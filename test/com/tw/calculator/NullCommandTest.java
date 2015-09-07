package com.tw.calculator;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class NullCommandTest {

    @Test
    public void shouldExecuteNothingOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        NullCommand nullCommand = new NullCommand(calculator, commandHistory, 0);

        nullCommand.execute();
        verifyZeroInteractions(calculator);
    }

    @Test
    public void shouldAddNullCommandToHistory() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        NullCommand nullCommand = new NullCommand(calculator, commandHistory, 0);

        nullCommand.addToHistory();
        verify(commandHistory).add(nullCommand);
    }
}