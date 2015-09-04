package com.tw.calculator;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;

public class ViewTest {
    private String input;
    private PrintStream out;
    private ByteArrayOutputStream outputStream;
    private ByteArrayInputStream inputStream;
    private Scanner scanner;


    @Before
    public void setUp() {
        input = "add 5";
        inputStream = new ByteArrayInputStream(input.getBytes());
        scanner = new Scanner(inputStream);
        outputStream = new ByteArrayOutputStream();
        out = new PrintStream(outputStream);
    }

    @Test
    public void shouldReadInput() {
        View view = new View(scanner, out);

        assertEquals(view.readInput(), input);
    }

    @Test
    public void shouldPrintResult() {
        View view = new View(scanner, out);

        view.printResult((float) 10.0);

        assertEquals(outputStream.toString(), "10.0\n");
    }
}