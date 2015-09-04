package com.tw.calculator;

public class MultiplyCommand implements Command {

    private float operand;
    private Calculator calculator;

    public MultiplyCommand(Calculator calculator, float operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    public void execute() {
        calculator.multiply(operand);
    }
}
