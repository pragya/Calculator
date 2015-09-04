package com.tw.calculator;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MultiplyCommandTest {

    @Test
    public void shouldExecuteAddOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        MultiplyCommand multiplyCommand = new MultiplyCommand(calculator, commandHistory, 5);

        multiplyCommand.execute();
        verify(calculator).multiply(5);
    }

    @Test
    public void shouldAddCommandToHistory() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        MultiplyCommand multiplyCommand = new MultiplyCommand(calculator, commandHistory, 5);

        multiplyCommand.addToHistory();
        verify(commandHistory).add(multiplyCommand);
    }
}