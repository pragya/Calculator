package com.tw.calculator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import static org.mockito.Mockito.*;

public class CalculatorControllerTest {
    private View view;
    private Parser parser;
    private Calculator calculator;
    private Command command;
    private ExitCommand exitCommand;

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Before
    public void setUp() {
        view = mock(View.class);
        parser = mock(Parser.class);
        calculator = mock(Calculator.class);
        command = mock(Command.class);
        CommandHistory commandHistory = mock(CommandHistory.class);
        exitCommand = new ExitCommand(calculator, commandHistory, 0);
    }

    @Test
    public void shouldReadInputAndParseAndExecute() {
        when(view.readInput()).thenReturn("add 5").thenReturn("exit");
        when(parser.parse("add 5")).thenReturn(command);
        when(parser.parse("exit")).thenReturn(exitCommand);

        exit.expectSystemExitWithStatus(0);
        doCallRealMethod().when(calculator).exit(0);

        CalculatorController calculatorController = new CalculatorController(view, parser, calculator);
        calculatorController.start();

        verify(view, times(2)).readInput();
        verify(parser).parse("add 5");
        verify(parser).parse("exit");
        verify(command).addToHistory();
        verify(command).execute();
        verify(view).printResult((float) 5.0);
    }
}