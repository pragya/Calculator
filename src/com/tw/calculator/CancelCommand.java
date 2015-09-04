package com.tw.calculator;

public class CancelCommand implements Command {

    private float operand;
    private Calculator calculator;

    public CancelCommand(Calculator calculator, float operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    public void execute() {
        calculator.cancel(operand);
    }
}
