package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner Trianlge = new Scanner(System.in);
        double a = Trianlge.nextDouble();
        double b = Trianlge.nextDouble();
        double c = Trianlge.nextDouble();

        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            System.out.print("TAK");
        } else if (a <= 0 || b <= 0 || c <= 0){
            System.out.print("BŁĄD");
        }else{
            System.out.print("NIE");
        }

    }
}