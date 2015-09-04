package com.tw.calculator;

import java.util.ArrayList;

public class RepeatCommand implements Command {

    private CommandHistory commandHistory;
    private float operand;
    private Calculator calculator;

    public RepeatCommand(Calculator calculator, CommandHistory commandHistory, float operand) {
        this.calculator = calculator;
        this.operand = operand;
        this.commandHistory = commandHistory;
    }

    public void execute() {
        ArrayList<Command> commandList = commandHistory.getLastNCommand(operand);
        for(Command command: commandList) {
            command.execute();
        }
    }

    public void addToHistory() {
        //do nothing
    }
}
