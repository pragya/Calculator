package com.tw.calculator;

import java.io.PrintStream;
import java.util.Scanner;

public class View {
    private Scanner scanner;
    private PrintStream outputStream;

    public View(Scanner scanner, PrintStream output) {
        this.scanner = scanner;
        this.outputStream = output;
    }

    public String readInput() {
        return scanner.nextLine();
    }

    public void printResult(Float accumulator) {
        outputStream.println(accumulator);
    }
}
