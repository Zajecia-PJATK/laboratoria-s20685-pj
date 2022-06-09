package com.company;

import java.io.*;
import java.util.*;

class ExampleInputOutput {
    public static void main(String[] args) throws IOException {
        double a ,b ;
        Scanner a1 = new Scanner(System.in);
        a = a1.nextDouble();
        b = a1.nextDouble();
        System.out.println(a * b);
    }
}