package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test() {
        Main main=new Main();
        int res=main.test(3,5);
        assertEquals(8,res,"The addition of 5 and 3 should be 8");
    }
    @Test
    public void testMultiplicationWithPositiveNumbers() {
        Main main = new Main();
        float result = main.mult(2, 3);
        assertEquals(6, result, "The multiplication of 2 and 3 should be 6");
    }

    @Test
    public void testMultiplicationWithZero() {
        Main main = new Main();
        float result = main.mult(0, 3);
        assertEquals(-1, result, "Multiplying with 0 should return -1 indicating an error");
    }

    @Test
    public void testMultiplicationWithNegativeNumber() {
        Main main = new Main();
        float result = main.mult(-2, 3);
        assertEquals(-1, result, "Multiplying with a negative number should return -1 indicating an error");
    }
}