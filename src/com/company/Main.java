package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Random generator = new Random();
        int liczbaWylosowana = (generator.nextInt(10)) + 1;

        System.out.println(liczbaWylosowana);

        Scanner skaner = new Scanner(System.in);
        int liczbaPodana = 0;

        System.out.print("Podaj liczbę z przedziału od 1 - 10: ");

        do
        {
            liczbaPodana = skaner.nextInt();

            if (liczbaPodana > 10 || liczbaPodana < 1)
            {
                System.out.print("Podałeś liczbę z poza zakresu. Spróbuj ponownie: ");
            }
            else
            {
                if (liczbaPodana == liczbaWylosowana)
                {
                    System.out.print("Brawo, zgadłeś!");
                }
                else if (liczbaPodana > liczbaWylosowana)
                {
                    System.out.print("Podałeś za dużą liczę. Spróbuj ponownie: ");
                }
                else if (liczbaPodana < liczbaWylosowana)
                {
                    System.out.print("Podałeś za małą liczbę. Sprobuj ponownie: ");
                }
            }
        } while (liczbaPodana != liczbaWylosowana);
    }

}

