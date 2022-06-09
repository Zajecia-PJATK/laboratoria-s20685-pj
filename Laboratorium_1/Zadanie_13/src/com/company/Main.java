package com.company;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        int stars = star.nextInt();

        for (int i = 1; i <= stars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.printf("\n");

        }
        for (int i = stars; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.printf("\n");
        }
        for (int i = 1; i <= stars; i++)
        {
            for (int j = 1; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <= stars; k++)
            {
                System.out.print("*");
            }
            System.out.printf("\n");
        }
        for (int i = stars-1 ; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < stars; k++) {
                System.out.print("*");
            }
            System.out.printf("\n");
        }

    }
}




