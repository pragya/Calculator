package com.tw.calculator;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DivideCommandTest {

    @Test
    public void shouldExecuteAddOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        DivideCommand divideCommand = new DivideCommand(calculator, commandHistory, 5);

        divideCommand.execute();
        verify(calculator).divide(5);
    }

    @Test
    public void shouldAddCommandToHistory() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        DivideCommand divideCommand = new DivideCommand(calculator, commandHistory, 5);

        divideCommand.addToHistory();
        verify(commandHistory).add(divideCommand);
    }
}