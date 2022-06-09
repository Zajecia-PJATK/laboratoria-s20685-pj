package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner tablica = new Scanner(System.in);
        int x = tablica.nextInt();
        int y = tablica.nextInt();
        int tab[][] = new int[x][y];
        for (int row = 0; row < x; row++) {
            for (int column = 0; column < y; column++) {
                tab[row][column] = tablica.nextInt();
            }
        }
        for (int row = 0; row < y; row++) {
            for (int column = 0; column < x; column++) {
                System.out.print(tab[column][row] + " ");
            }
            System.out.println();
        }
    }
}
