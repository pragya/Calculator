package com.tw.calculator;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SubtractCommandTest {

    @Test
    public void shouldExecuteAddOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        SubtractCommand subtractCommand = new SubtractCommand(calculator, commandHistory, 1);

        subtractCommand.execute();
        verify(calculator).subtract(1);
    }

    @Test
    public void shouldAddSubtractCommandToHistory() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        SubtractCommand subtractCommand = new SubtractCommand(calculator, commandHistory, 1);

        subtractCommand.addToHistory();
        verify(commandHistory).add(subtractCommand);
    }
}