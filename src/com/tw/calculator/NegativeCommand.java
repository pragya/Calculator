package com.tw.calculator;

public class NegativeCommand implements Command {

    private CommandHistory commandHistory;
    private float operand;
    private Calculator calculator;

    public NegativeCommand(Calculator calculator, CommandHistory commandHistory, float operand) {
        this.calculator = calculator;
        this.operand = operand;
        this.commandHistory = commandHistory;
    }

    public void execute() {
        calculator.neg(operand);
    }

    public void addToHistory() {
        commandHistory.add(this);
    }
}
