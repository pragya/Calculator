package com.tw.calculator;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class CommandHistoryTest {

    @Test
    public void shouldAddCommandToTheListOfCommand() {
        Command command = mock(Command.class);
        CommandHistory commandHistory = new CommandHistory();

        commandHistory.add(command);

        assertEquals(commandHistory.size(), 1);
    }

    @Test
    public void shouldRetrieveLastNCommand() {
        Command command1 = mock(Command.class);
        Command command2 = mock(Command.class);
        Command command3 = mock(Command.class);
        CommandHistory commandHistory = new CommandHistory();
        commandHistory.add(command1);
        commandHistory.add(command2);
        commandHistory.add(command3);

        ArrayList<Command> list = commandHistory.getLastNCommand(2);
        assertEquals(list.size(), 2);
        assertEquals(list.get(0), command2);
        assertEquals(list.get(1), command3);
    }
}