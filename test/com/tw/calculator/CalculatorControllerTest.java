package com.tw.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class CalculatorControllerTest {
    private View view;
    private Parser parser;
    private Calculator calculator;
    private Command command;
    private ExitCommand exitCommand;

    @Before
    public void setUp() {
        view = mock(View.class);
        parser = mock(Parser.class);
        calculator = mock(Calculator.class);
        command = mock(Command.class);
        exitCommand = mock(ExitCommand.class);
    }

    @Test
    public void shouldDelegateToCalculatorController() {
//        when(view.readInput()).thenReturn("add 5");
//        when(parser.parse("add 5")).thenReturn(command);
////        when(parser.parse("exit")).thenReturn(exitCommand);
//
//        doNothing().when(command).execute();
//
//        when(calculator.getAccumulator()).thenReturn((float) 5.0);
//        doNothing().when(view).printResult((float) 5.0);
//
//        CalculatorController calculatorController = new CalculatorController(view, parser, calculator);
//        calculatorController.start();
//
//        verify(view, times(1)).readInput();
//        verify(parser).parse("add 5");
////        verify(parser).parse("exit");
//        verify(command).execute();
//        verify(view).printResult((float) 5.0);
    }
}