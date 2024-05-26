package org.example;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String numberString = "1,234,567.89";

        try {
            // Get the default number format instance
            NumberFormat numberFormat = NumberFormat.getNumberInstance();
            Number parsedNumber = numberFormat.parse(numberString);
            System.out.println("Parsed Number: " + parsedNumber);

            // Get the number format instance for a specific locale
            NumberFormat numberFormatLocale = NumberFormat.getNumberInstance(Locale.GERMANY);
            String numberStringLocale = "1.234.567,89";
            Number parsedNumberLocale = numberFormatLocale.parse(numberStringLocale);
            System.out.println("Parsed Number (Germany): " + parsedNumberLocale);
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    public int test(int a,int b){
        return a+b;
    }
    public float mult(int a, int b) {
        if (a <= 0 || b <= 0) {
            System.out.println("error");
            return -1; // Return a default error value
        }
        return a * b;
    }
}