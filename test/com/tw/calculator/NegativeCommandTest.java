package com.tw.calculator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class NegativeCommandTest {

    @Test
    public void shouldExecuteNegativeOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        NegativeCommand negativeCommand = new NegativeCommand(calculator, commandHistory, 0);

        negativeCommand.execute();
        verify(calculator).neg(0);
    }

    @Test
    public void shouldAddNegativeCommandToHistory() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        NegativeCommand negativeCommand = new NegativeCommand(calculator, commandHistory, 0);

        negativeCommand.addToHistory();
        verify(commandHistory).add(negativeCommand);
    }
}