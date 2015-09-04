package com.tw.calculator;

public class AddCommand implements Command {

    private float operand;
    private Calculator calculator;

    public AddCommand(Calculator calculator, float operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    public void execute() {
        calculator.add(operand);
    }
}
