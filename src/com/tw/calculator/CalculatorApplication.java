package com.tw.calculator;

import java.util.Scanner;

public class CalculatorApplication {

    private Calculator calculator;
    private Parser parser;
    private View view;

    public CalculatorApplication(View view, Parser parser, Calculator calculator) {
        this.view = view;
        this.parser = parser;
        this.calculator = calculator;
    }

    public static void main(String[] args) {
        View view = new View(new Scanner(System.in), System.out);
        Calculator calculator = new Calculator();
        Parser parser = new Parser(calculator);

        CalculatorApplication calculatorApplication = new CalculatorApplication(view, parser, calculator);
        calculatorApplication.start();
    }

    public void start() {
        String input = view.readInput();
        Command command = parser.parse(input);
        command.execute();
        view.printResult(calculator.getAccumulator());
    }
}
