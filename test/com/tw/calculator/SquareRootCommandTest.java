package com.tw.calculator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SquareRootCommandTest {

    @Test
    public void shouldExecuteSquareRootOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        SquareRootCommand squareRootCommand = new SquareRootCommand(calculator, commandHistory, 0);

        squareRootCommand.execute();
        verify(calculator).sqrt(0);
    }

    @Test
    public void shouldAddSquareRootCommandToHistory() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        SquareRootCommand squareRootCommand = new SquareRootCommand(calculator, commandHistory, 0);

        squareRootCommand.addToHistory();
        verify(commandHistory).add(squareRootCommand);
    }
}