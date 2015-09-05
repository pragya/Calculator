package com.tw.calculator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SquareCommandTest {

    @Test
    public void shouldExecuteSquareOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        SquareCommand squareCommand = new SquareCommand(calculator, commandHistory, 0);

        squareCommand.execute();
        verify(calculator).sqr(0);
    }

    @Test
    public void shouldAddSquareCommandToHistory() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        SquareCommand squareCommand = new SquareCommand(calculator, commandHistory, 0);

        squareCommand.addToHistory();
        verify(commandHistory).add(squareCommand);
    }
}