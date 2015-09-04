package com.tw.calculator;

import java.util.ArrayList;

public class CommandHistory {
    private ArrayList<Command> commandList = new ArrayList<>();

    public void add(Command command) {
        commandList.add(command);
    }

    public int size() {
        return commandList.size();
    }

    public ArrayList<Command> getLastNCommand(float operand) {
        int startingIndex = commandList.size() - (int) operand;
        ArrayList<Command> list = new ArrayList<>();
        for(int index = startingIndex; index < commandList.size(); index++) {
            list.add(commandList.get(index));
        }
        return list;
    }
}
