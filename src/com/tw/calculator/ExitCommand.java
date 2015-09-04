package com.tw.calculator;

public class ExitCommand implements Command {

    private float operand;
    private Calculator calculator;

    public ExitCommand(Calculator calculator, float operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    public void execute() {
        calculator.exit(0);
    }



}
