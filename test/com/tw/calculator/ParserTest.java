package com.tw.calculator;

import org.junit.Test;
import org.mockito.internal.matchers.Null;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class ParserTest {

    @Test
    public void shouldParseAGivenStringAndReturnAddCommand() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        Parser parser = new Parser(calculator, commandHistory);

        Command command = parser.parse("add 5");
        AddCommand addCommand = new AddCommand(calculator, commandHistory, 5);
        assertEquals(addCommand.getClass(), command.getClass());
    }

    @Test
    public void shouldParseAGivenStringAndReturnSubtractCommand() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        Parser parser = new Parser(calculator, commandHistory);

        Command command = parser.parse("subtract 5");
        SubtractCommand subtractCommand = new SubtractCommand(calculator, commandHistory, 5);
        assertEquals(subtractCommand.getClass(), command.getClass());
    }

    @Test
    public void shouldParseAGivenStringAndReturnMultiplyCommand() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        Parser parser = new Parser(calculator, commandHistory);

        Command command = parser.parse("multiply 5");
        MultiplyCommand multiplyCommand = new MultiplyCommand(calculator, commandHistory, 5);
        assertEquals(multiplyCommand.getClass(), command.getClass());
    }

    @Test
    public void shouldParseAGivenStringAndReturnDivideCommand() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        Parser parser = new Parser(calculator, commandHistory);

        Command command = parser.parse("divide 5");
        DivideCommand divideCommand = new DivideCommand(calculator, commandHistory, 5);
        assertEquals(divideCommand.getClass(), command.getClass());
    }

    @Test
    public void shouldParseAGivenStringAndReturnCancelCommand() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        Parser parser = new Parser(calculator, commandHistory);

        Command command = parser.parse("cancel");
        CancelCommand cancelCommand = new CancelCommand(calculator, commandHistory, 0);
        assertEquals(cancelCommand.getClass(), command.getClass());
    }

    @Test
    public void shouldParseAGivenStringAndReturnExitCommand() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        Parser parser = new Parser(calculator, commandHistory);

        Command command = parser.parse("exit");
        ExitCommand exitCommand = new ExitCommand(calculator, commandHistory, 0);
        assertEquals(exitCommand.getClass(), command.getClass());
    }

    @Test
    public void shouldParseAGivenStringAndReturnNullCommand() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        Parser parser = new Parser(calculator, commandHistory);

        Command command = parser.parse("invalid command");
        NullCommand nullCommand = new NullCommand(calculator, commandHistory, 0);
        assertEquals(nullCommand.getClass(), command.getClass());
    }

    @Test
    public void shouldParseAGivenStringAndIfStringIsNotValidReturnNullCommand() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        Parser parser = new Parser(calculator, commandHistory);

        Command command = parser.parse("add invalid command");
        NullCommand nullCommand = new NullCommand(calculator, commandHistory, 0);
        assertEquals(nullCommand.getClass(), command.getClass());
    }

    @Test
    public void shouldParseAGivenStringAndReturnRepeatCommand() {
        Calculator calculator = mock(Calculator.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        Parser parser = new Parser(calculator, commandHistory);

        Command command = parser.parse("repeat 2");
        RepeatCommand repeatCommand = new RepeatCommand(calculator, commandHistory, 0);
        assertEquals(repeatCommand.getClass(), command.getClass());
    }
}