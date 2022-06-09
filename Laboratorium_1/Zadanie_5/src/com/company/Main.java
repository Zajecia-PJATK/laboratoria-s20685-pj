package com.company;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        int a ,b ;
        Scanner a1 = new Scanner(System.in);
        a = a1.nextInt();
        b = a1.nextInt();
        System.out.printf("Dodawanie: %s + %s = %s\n", a, b, a + b);
        System.out.printf("Odejmowanie: %s - %s = %s\n",a, b, a - b);
        System.out.printf("Mnożenie: %s * %s = %s\n", a, b, a*b);
        System.out.printf("Dzielenie modulo: %s mod %s = %s\n", a, b, a%b);
    }
}

