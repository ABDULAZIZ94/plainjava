package com.example.aziz;

import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class HackerRankCurrencyFormatter {
    public static void runTest(){
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat nf =  NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf.format(payment);

        Locale indian = new Locale("EN", "IN");
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(indian);
        DecimalFormatSymbols format = new DecimalFormatSymbols(indian);
        format.setCurrencySymbol("Rs.");

        nf2.setMaximumFractionDigits(2);
        String india = nf2.format(payment);

        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf3.format(payment);

        NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf4.format(payment);

        System.out.println("US: "+us);
        System.out.println("India: "+india);
        System.out.println("China: "+china);
        System.out.println("France: "+france);
    }
}
