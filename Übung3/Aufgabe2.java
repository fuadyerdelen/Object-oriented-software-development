package Übung3;

import java.util.Scanner;

public class Aufgabe2 {

// Übung2.c
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie zwei Ganzzahlen ein: ");
        int nummer1 = scan.nextInt();
        int nummer2 = scan.nextInt();
        scan.close();

// Übung2.d        
        try {
            System.out.println(div(nummer1, nummer2));
        } catch (Exception ae) {
            ae.printStackTrace();
            System.out.println(ae.getMessage());
        }

    }

// übung 2.a
    public static int div(int nummer1, int nummer2) {

// Übung2.b
        if (nummer2 == 0) {
            System.out.println("Division durch 0 ist nicht möglich!");
            return 0;
        }

        /*
         * int div = nummer1 / nummer2;
         * System.out.println("Die Division ist " + div);
         */
        return nummer1 / nummer2;
    }

}
