package com.tw.calculator;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ExitCommandTest {

    @Test
    public void shouldExecuteAddOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        ExitCommand exitCommand = new ExitCommand(calculator, commandHistory, 0);

        exitCommand.execute();
        verify(calculator).exit(0);
    }
}