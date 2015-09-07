package com.tw.calculator;

public class NullCommand implements Command {

    private float operand;
    private CommandHistory commandHistory;
    private Calculator calculator;

    public NullCommand(Calculator calculator, CommandHistory commandHistory, float operand) {
        this.calculator = calculator;
        this.operand = operand;
        this.commandHistory = commandHistory;
    }

    public void execute() {
        //do nothing
    }

    public void addToHistory() {
        commandHistory.add(this);
    }
}
