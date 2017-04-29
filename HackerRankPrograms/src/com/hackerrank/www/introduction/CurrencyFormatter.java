package com.hackerrank.www.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter 
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        //payment formatted according to Locale Currency
        NumberFormat US=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat INDIA=NumberFormat.getCurrencyInstance(new Locale("en","in"));
        NumberFormat CHINA=NumberFormat.getCurrencyInstance(Locale.CHINESE);
        NumberFormat FRANCE=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        //payment formatted according to countries
        String us=US.format(payment);
        String india=INDIA.format(payment);
        String china=CHINA.format(payment);
        String france=FRANCE.format(payment);
        //output
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
