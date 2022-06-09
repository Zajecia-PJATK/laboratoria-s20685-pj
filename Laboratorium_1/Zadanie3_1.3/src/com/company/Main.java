package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        List<Integer> numberlist = new ArrayList<>();
        while (numberlist < numberlist.size()) {
                    numberlist.add(liczba.nextInt());
                    i++;
        }
        numberlist.sort(Collections.reverseOrder());
        System.out.println(numberlist);

    }
}