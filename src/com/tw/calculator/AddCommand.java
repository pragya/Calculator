package com.tw.calculator;

public class AddCommand implements Command {

    private CommandHistory commandHistory;
    private float operand;
    private Calculator calculator;

    public AddCommand(Calculator calculator, CommandHistory commandHistory, float operand) {
        this.calculator = calculator;
        this.operand = operand;
        this.commandHistory = commandHistory;
    }

    public void execute() {
        calculator.add(operand);
    }

    public void addToHistory() {
        commandHistory.add(this);
    }
}


