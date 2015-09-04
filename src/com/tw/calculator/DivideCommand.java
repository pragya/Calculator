package com.tw.calculator;

public class DivideCommand implements Command {

    private float operand;
    private Calculator calculator;

    public DivideCommand(Calculator calculator, float operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    public void execute() {
        calculator.divide(operand);
    }
}
