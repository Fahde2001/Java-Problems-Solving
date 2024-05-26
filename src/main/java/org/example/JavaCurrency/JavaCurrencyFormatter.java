package org.example.JavaCurrency;
import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat numberFormatUS=NumberFormat.getCurrencyInstance(Locale.US);
        String us=numberFormatUS.format(payment);

        Locale indiaLocal=new Locale("en","IN");
        NumberFormat numberFormatIndiFormat=NumberFormat.getCurrencyInstance(indiaLocal);
        String india=numberFormatIndiFormat.format(payment).replace("¤", "Rs.");

        NumberFormat numberFormatChina=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=numberFormatChina.format(payment);

        NumberFormat numberFormatFrance=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=numberFormatFrance.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}