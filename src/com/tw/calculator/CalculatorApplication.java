package com.tw.calculator;

import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {
        View view = new View(new Scanner(System.in), System.out);
        Calculator calculator = new Calculator();
        CommandHistory commandHistory = new CommandHistory();
        Parser parser = new Parser(calculator, commandHistory);

        CalculatorController calculatorController = new CalculatorController(view, parser, calculator);
        calculatorController.start();
    }
}
