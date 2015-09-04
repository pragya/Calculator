package com.tw.calculator;

public class DivideCommand implements Command {

    private float operand;
    private CommandHistory commandHistory;
    private Calculator calculator;

    public DivideCommand(Calculator calculator, CommandHistory commandHistory, float operand) {
        this.calculator = calculator;
        this.operand = operand;
        this.commandHistory = commandHistory;
    }

    public void execute() {
        calculator.divide(operand);
    }

    public void addToHistory() {
        commandHistory.add(this);
    }
}
