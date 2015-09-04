package com.tw.calculator;

public class Calculator {

    private float accumulator;

    public Calculator() {
        this.accumulator = 0;
    }

    public Calculator(float accumulator) {
        this.accumulator = accumulator;
    }

    public void add(float operand) {
        accumulator += operand;
    }

    public void subtract(float operand) {
        accumulator -= operand;
    }

    public void multiply(float operand) {
        accumulator *= operand;
    }

    public void divide(float operand) {
        if(operand != 0)
            accumulator /= operand;
    }

    public void cancel(float operand) {
        accumulator = 0;
    }

    public void exit(float operand) {
        System.exit(0);
    }

    public float getAccumulator() {
        return accumulator;
    }


}
