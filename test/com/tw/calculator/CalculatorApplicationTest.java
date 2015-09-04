package com.tw.calculator;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class CalculatorApplicationTest {

    @Test
    public void shouldDelegateToCalculatorController() {
        View view = mock(View.class);
        when(view.readInput()).thenReturn("add 5");
        Command command = mock(Command.class);
        Parser parser = mock(Parser.class);
        Calculator calculator = mock(Calculator.class);
        when(parser.parse("add 5")).thenReturn(command);

        CalculatorApplication calculatorApplication = new CalculatorApplication(view, parser, calculator);
        calculatorApplication.start();

        verify(view).readInput();
        verify(parser).parse("add 5");
    }

}