package org.example.JavaGenerics;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class JavaGenericsTest {

    @Test
    void testPrintArray_withIntegerArray() {
        Integer[] intArray = {1, 2, 3};
        String expectedOutput = "\n1\n2\n3\n";

        String printedOutput = capturePrintedOutput(() -> Printer.printArray(intArray));

        assertEquals(expectedOutput, printedOutput);
    }

    @Test
    void testPrintArray_withStringArray() {
        String[] stringArray = {"Hello", "World"};
        String expectedOutput = "Hello\nWorld\n";

        String printedOutput = capturePrintedOutput(() -> Printer.printArray(stringArray));

        assertEquals(expectedOutput, printedOutput);
    }

    private String capturePrintedOutput(Runnable action) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        action.run();
        System.setOut(originalOut);
        String printedOutput = outputStream.toString();
        System.out.println("Printed Output: " + printedOutput); // Added logging
        return printedOutput;
    }

}