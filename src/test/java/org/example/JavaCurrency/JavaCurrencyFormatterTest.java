package org.example.JavaCurrency;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class JavaCurrencyFormatterTest {
    @Test
    public void testUSCurrencyFormatting() {
        double payment = 12324.134;
        String expected = "$12,324.13";

        NumberFormat numberFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
        String actual = numberFormatUS.format(payment);

        assertEquals(expected, actual);
    }

    @Test
    public void testIndiaCurrencyFormatting() {
        double payment = 12324.134;
        String expected = "₹12,324.13";

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat numberFormatIndia = NumberFormat.getCurrencyInstance(indiaLocale);
        String actual = numberFormatIndia.format(payment);

        assertEquals(expected, actual);
    }

    @Test
    public void testChinaCurrencyFormatting() {
        double payment = 12324.134;
        String expected = "¥12,324.13";

        NumberFormat numberFormatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String actual = numberFormatChina.format(payment);

        assertEquals(expected, actual);
    }

    @Test
    public void testFranceCurrencyFormatting() {
        double payment = 32321424.4234;
        String expected = "32 321 424,42 €";

        NumberFormat numberFormatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String actual = numberFormatFrance.format(payment);

        assertEquals(expected, actual);
    }

}