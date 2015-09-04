package com.tw.calculator;

public class NullCommand implements Command {

    private float operand;
    private Calculator calculator;

    public NullCommand(Calculator calculator, float operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    public void execute() {
        //do nothing
    }
}
