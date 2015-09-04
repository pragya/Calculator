package com.tw.calculator;

public class SubtractCommand implements Command {

    private float operand;
    private Calculator calculator;

    public SubtractCommand(Calculator calculator, float operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    public void execute() {
        calculator.subtract(operand);
    }
}
