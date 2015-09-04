package com.tw.calculator;

public class ExitCommand implements Command {

    private float operand;
    private CommandHistory commandHistory;
    private Calculator calculator;

    public ExitCommand(Calculator calculator, CommandHistory commandHistory, float operand) {
        this.calculator = calculator;
        this.operand = operand;
        this.commandHistory = commandHistory;
    }

    public void execute() {
        calculator.exit(0);
    }

    public void addToHistory() {
        //do nothing
    }
}
