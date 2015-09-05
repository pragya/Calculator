package com.tw.calculator;

public class Parser {

    private CommandHistory commandHistory;
    private Calculator calculator;

    public Parser(Calculator calculator, CommandHistory commandHistory) {
        this.calculator = calculator;
        this.commandHistory = commandHistory;
    }

    public Command parse(String inputString) {
        String[] tokens = inputString.split(" ");
        float value = getValue(tokens);

        if(tokens.length > 2) {
            return new NullCommand(calculator, commandHistory, value);
        }

        return getCommand(tokens[0], value);
    }

    private float getValue(String[] tokens) {
        try {
            return Float.parseFloat(tokens[1]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            return 0;
        }
    }

    private Command getCommand(String command, float value) {
        switch (command) {
            case "add" :
                return new AddCommand(calculator, commandHistory, value);
            case "subtract" :
                return new SubtractCommand(calculator, commandHistory, value);
            case "multiply" :
                return new MultiplyCommand(calculator, commandHistory, value);
            case "divide" :
                return new DivideCommand(calculator, commandHistory, value);
            case "cancel" :
                return new CancelCommand(calculator, commandHistory, value);
            case "exit" :
                return new ExitCommand(calculator, commandHistory, value);
            case "sqr" :
                return new SquareCommand(calculator, commandHistory, value);
            case "sqrt" :
                return new SquareRootCommand(calculator, commandHistory, value);
            case "neg" :
                return new NegativeCommand(calculator, commandHistory, value);
            case "abs" :
                return new AbsoluteCommand(calculator, commandHistory, value);
            case "repeat" :
                return new RepeatCommand(calculator, commandHistory, value);
            default:
                return new NullCommand(calculator, commandHistory,value);
        }
    }
}
