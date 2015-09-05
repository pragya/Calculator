package com.tw.calculator;

public class SquareRootCommand implements Command {

    private CommandHistory commandHistory;
    private float operand;
    private Calculator calculator;

    public SquareRootCommand(Calculator calculator, CommandHistory commandHistory, float operand) {
        this.calculator = calculator;
        this.operand = operand;
        this.commandHistory = commandHistory;
    }

    public void execute() {
        calculator.sqrt(operand);
    }

    public void addToHistory() {
        commandHistory.add(this);
    }
}
