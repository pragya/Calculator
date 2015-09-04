package com.tw.calculator;

public class Parser {

    private Calculator calculator;

    public Parser(Calculator calculator) {
        this.calculator = calculator;
    }

    public Command parse(String inputString) {
        String[] tokens = inputString.split(" ");
        float value;
        //TODO handle command validations ie add 5 3 should return nullcommand etc

        try {
            value = Float.parseFloat(tokens[1]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            value = 0;
        }
      
        return getCommand(tokens[0], value);
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
