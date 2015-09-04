package com.tw.calculator;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CancelCommandTest {

    @Test
    public void shouldExecuteAddOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        CancelCommand cancelCommand = new CancelCommand(calculator, commandHistory, 0);

        cancelCommand.execute();
        verify(calculator).cancel(0);
    }

    @Test
    public void shouldAddCommandToHistory() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        CancelCommand cancelCommand = new CancelCommand(calculator, commandHistory, 0);

        cancelCommand.addToHistory();
        verify(commandHistory).add(cancelCommand);
    }
}