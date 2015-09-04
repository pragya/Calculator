package com.tw.calculator;

public class MultiplyCommand implements Command {

    private float operand;
    private CommandHistory commandHistory;
    private Calculator calculator;

    public MultiplyCommand(Calculator calculator, CommandHistory commandHistory, float operand) {
        this.calculator = calculator;
        this.operand = operand;
        this.commandHistory = commandHistory;
    }

    public void execute() {
        calculator.multiply(operand);
    }

    public void addToHistory() {
        commandHistory.add(this);
    }
}
