package com.tw.calculator;

public class CancelCommand implements Command {

    private float operand;
    private CommandHistory commandHistory;
    private Calculator calculator;

    public CancelCommand(Calculator calculator, CommandHistory commandHistory, float operand) {
        this.calculator = calculator;
        this.operand = operand;
        this.commandHistory = commandHistory;
    }

    public void execute() {
        calculator.cancel(operand);
    }

    public void addToHistory() {
        commandHistory.add(this);
    }
}
