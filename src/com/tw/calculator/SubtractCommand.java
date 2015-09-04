package com.tw.calculator;

public class SubtractCommand implements Command {

    private CommandHistory commandHistory;
    private float operand;
    private Calculator calculator;

    public SubtractCommand(Calculator calculator, CommandHistory commandHistory, float operand) {
        this.calculator = calculator;
        this.operand = operand;
        this.commandHistory = commandHistory;
    }

    public void execute() {
        calculator.subtract(operand);
    }

    public void addToHistory() {
        commandHistory.add(this);
    }
}
