package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[]args)
    {
        ArrayList<String> Words = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext())
        {
            for(String word : sc.nextLine().split(" "))
            {
                Words.add(word);
            }
        }
        System.out.println(Words.toString());
    }
}
