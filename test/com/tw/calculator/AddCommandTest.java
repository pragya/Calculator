package com.tw.calculator;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AddCommandTest {

    @Test
    public void shouldExecuteAddOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        AddCommand addCommand = new AddCommand(calculator, commandHistory, 5);

        addCommand.execute();
        verify(calculator).add(5);
    }

    @Test
    public void shouldAddCommandToHistory() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        AddCommand addCommand = new AddCommand(calculator, commandHistory, 5);

        addCommand.addToHistory();
        verify(commandHistory).add(addCommand);
    }
}