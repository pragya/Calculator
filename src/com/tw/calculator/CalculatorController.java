package com.tw.calculator;

public class CalculatorController {

    private Calculator calculator;
    private Parser parser;
    private View view;

    public CalculatorController(View view, Parser parser, Calculator calculator) {
        this.view = view;
        this.parser = parser;
        this.calculator = calculator;
    }

    public void start() {
//        while(true) {
            String input = view.readInput();
            Command command = parser.parse(input);
            command.execute();
            view.printResult(calculator.getAccumulator());
//        }
    }
}
