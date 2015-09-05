package com.tw.calculator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AbsoluteCommandTest {

    @Test
    public void shouldExecuteAbsoluteOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        AbsoluteCommand absoluteCommand = new AbsoluteCommand(calculator, commandHistory, 0);

        absoluteCommand.execute();
        verify(calculator).abs(0);
    }

    @Test
    public void shouldAddAbsoluteCommandToHistory() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        AbsoluteCommand absoluteCommand = new AbsoluteCommand(calculator, commandHistory, 0);

        absoluteCommand.addToHistory();
        verify(commandHistory).add(absoluteCommand);
    }
}