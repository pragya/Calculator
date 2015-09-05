package com.tw.calculator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.mockito.Mockito.*;

public class RepeatCommandTest {

    @Test
    public void shouldExecuteAllRepeatedCommaCalculator() {
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
}