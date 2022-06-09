package com.company;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale locale = Locale.ENGLISH;
        NumberFormat nf = NumberFormat.getNumberInstance(locale);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        Scanner dane = new Scanner(System.in);
        double sekundy = dane.nextDouble();
        String planeta = null;
        dane.nextLine();
        planeta = dane.nextLine() ;

        if(planeta.equals("Ziemia")){
            double czas =31557600;
            double wiek =  sekundy/czas;
            System.out.println(nf.format(wiek));
        }
        if(planeta.equals("Merkury")){
            double czas=7600543.82;
            double wiek =  sekundy/czas;
            System.out.println(nf.format(wiek));
        }
        if(planeta.equals("Wenus")){
            double czas=19414149.05;
            double wiek =  sekundy/czas;
            System.out.println(nf.format(wiek));
        }
        if(planeta.equals("Mars")){
            double czas=59354032.69;
            double wiek =  sekundy/czas;
            System.out.println(nf.format(wiek));
        }
        if(planeta.equals("Jowisz")){
            double czas=374355659.12;
            double wiek =  sekundy/czas;
            System.out.println(nf.format(wiek));
        }
        if(planeta.equals("Saturn")){
            double czas=929292362.88;
            double wiek =  sekundy/czas;
            System.out.println(nf.format(wiek));
        }
        if(planeta.equals("Uran")){
            double czas=2651370019.32;
            double wiek =  sekundy/czas;
            System.out.println(nf.format(wiek));
        }
        if(planeta.equals("Neptun")){
            double czas=5200418560.03;
            double wiek =  sekundy/czas;
            System.out.println(nf.format(wiek));
        }
    }
}
