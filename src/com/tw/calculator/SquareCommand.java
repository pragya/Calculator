package com.tw.calculator;

public class SquareCommand implements Command {

    private CommandHistory commandHistory;
    private float operand;
    private Calculator calculator;

    public SquareCommand(Calculator calculator, CommandHistory commandHistory, float operand) {
        this.calculator = calculator;
        this.operand = operand;
        this.commandHistory = commandHistory;
    }

    public void execute() {
        calculator.sqr(operand);
    }

    public void addToHistory() {
        commandHistory.add(this);
    }
}
