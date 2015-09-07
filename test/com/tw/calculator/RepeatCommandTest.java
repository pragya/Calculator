package com.tw.calculator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.mockito.Mockito.*;

public class RepeatCommandTest {

    @Test
    public void shouldExecuteAllRepeatedCommandOnCalculator() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        Command command = mock(Command.class);
        when(commandHistory.getLastNCommand(2)).thenReturn(new ArrayList<Command>(Arrays.asList(command, command)));
        doNothing().when(command).execute();

        RepeatCommand repeatCommand = new RepeatCommand(calculator, commandHistory, 2);
        repeatCommand.execute();

        verify(commandHistory).getLastNCommand(2);
        verify(command, times(2)).execute();
    }

    @Test
    public void shouldAddNothingOnHistory() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        RepeatCommand repeatCommand = new RepeatCommand(calculator, commandHistory, 2);

        repeatCommand.addToHistory();
        verifyZeroInteractions(commandHistory);
    }
}