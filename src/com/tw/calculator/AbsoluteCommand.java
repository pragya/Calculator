package com.tw.calculator;

public class AbsoluteCommand implements Command {

    private CommandHistory commandHistory;
    private float operand;
    private Calculator calculator;

    public AbsoluteCommand(Calculator calculator, CommandHistory commandHistory, float operand) {
        this.calculator = calculator;
        this.operand = operand;
        this.commandHistory = commandHistory;
    }

    public void execute() {
        calculator.abs(operand);
    }

    public void addToHistory() {
        commandHistory.add(this);
    }
}
