package com.tw.calculator;

public class Parser {

    private Calculator calculator;

    public Parser(Calculator calculator) {
        this.calculator = calculator;
    }

    public Command parse(String inputString) {
        String[] tokens = inputString.split(" ");
        float value = getValue(tokens);

        if(tokens.length > 2) {
            return new NullCommand(calculator, value);
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
                return new AddCommand(calculator, value);
            case "subtract" :
                return new SubtractCommand(calculator, value);
            case "multiply" :
                return new MultiplyCommand(calculator, value);
            case "divide" :
                return new DivideCommand(calculator, value);
            case "cancel" :
                return new CancelCommand(calculator, value);
            case "exit" :
                return new ExitCommand(calculator, value);
            default:
                return new NullCommand(calculator, value);
        }
    }
}
