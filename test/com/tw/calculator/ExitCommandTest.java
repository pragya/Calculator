package com.tw.calculator;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

public class ExitCommandTest {

    @Test
    public void shouldExecuteExitOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        ExitCommand exitCommand = new ExitCommand(calculator, commandHistory, 0);

        exitCommand.execute();
        verify(calculator).exit(0);
    }

    @Test
    public void shouldAddNothingOnHistory() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        ExitCommand exitCommand = new ExitCommand(calculator, commandHistory, 0);

        exitCommand.execute();
        verifyZeroInteractions(commandHistory);
    }
}