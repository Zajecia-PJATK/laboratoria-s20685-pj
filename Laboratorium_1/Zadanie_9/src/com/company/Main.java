package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b, c;
        Scanner length = new Scanner(System.in);
        a = length.nextDouble();
        b = length.nextDouble();
        c = length.nextDouble();
        Locale locale = Locale.ENGLISH;

        NumberFormat nf = NumberFormat.getNumberInstance(locale);
        nf.setMinimumFractionDigits(6);
        nf.setMaximumFractionDigits(6);

        if (a > b && b > c) {
            System.out.print(nf.format(c) + " ");
            if (a > b) {
                System.out.print(nf.format(b) + " " + nf.format(a) + "\n");
                System.out.print(nf.format(a) + " " + nf.format(b) + " " + nf.format(c) + "\n");
            }
        } else if (b > a && a > c) {
            System.out.print(nf.format(c) + " ");
            if (b > a) {
                System.out.print(nf.format(a) + " " + nf.format(b)  + "\n");
                System.out.print(nf.format(b)  + " " + nf.format(a) + " " + nf.format(c) + "\n");
            }
        } else if (a > c && c > b) {
            System.out.print(nf.format(b)  + " ");
            if (a > c) {
                System.out.print(nf.format(c) + " " + nf.format(a) + "\n");
                System.out.print(nf.format(a) + " " + nf.format(c) + " " + nf.format(b)  + "\n");
            }
        } else if (c > a && a > b) {
            System.out.print(nf.format(b)  + " ");
            if (c > a) {
                System.out.print(nf.format(a) + " " + nf.format(c) + "\n");
                System.out.print(nf.format(c) + " " + nf.format(a) + " " + nf.format(b)  + "\n");
            }
        } else if (c > b && b > a) {
            System.out.print(nf.format(a) + " ");
            if (c > b) {
                System.out.print(nf.format(b)  + " " + nf.format(c) + "\n");
                System.out.print(nf.format(c) + " " + nf.format(b)  + " " + nf.format(a) + "\n");
            }
        } else if (b > c && b > a) {
            System.out.print(nf.format(a) + " ");
            if (b > c) {
                System.out.print(nf.format(c) + " " + nf.format(b)  + "\n");
                System.out.print(nf.format(b)  + " " + nf.format(c) + " " + nf.format(a) + "\n");
            }
        }
    }
}
