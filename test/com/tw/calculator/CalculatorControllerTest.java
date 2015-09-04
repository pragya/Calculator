package com.tw.calculator;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class CalculatorControllerTest {

    @Test
    public void shouldDelegateToCalculatorController() {
        View view = mock(View.class);
        Parser parser = mock(Parser.class);
        Calculator calculator = mock(Calculator.class);
        Command command = mock(Command.class);
        ExitCommand exitCommand = mock(ExitCommand.class);

        when(view.readInput()).thenReturn("add 5");
        when(parser.parse("add 5")).thenReturn(command);
        doNothing().when(command).execute();
        when(calculator.getAccumulator()).thenReturn((float) 5.0);
        doNothing().when(view).printResult((float) 5.0);

        CalculatorController calculatorController = new CalculatorController(view, parser, calculator);
        calculatorController.start();

        verify(view).readInput();
        verify(parser).parse("add 5");
        verify(command).execute();
        verify(view).printResult((float) 5.0);
    }
}