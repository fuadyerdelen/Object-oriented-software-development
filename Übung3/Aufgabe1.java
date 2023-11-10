package Übung3;

import java.util.Locale;
import java.util.Scanner;

public class Aufgabe1 {

    public static void main(String[] args) {

        /*
         * wenn wir Commadezahlen ivon Console lesen wollen, dann brauchen wir
         * "useLocale(Locale.US)"
         */

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Bitte geben Sie drei Gleitkommazahlen ein: ");

        double nummer1 = scan.nextDouble();
        double nummer2 = scan.nextDouble();
        double nummer3 = scan.nextDouble();
        scan.close();

        maximale(nummer1, nummer2, nummer3);
        minimale(nummer1, nummer2, nummer3);
        durschnitt(nummer1, nummer2, nummer3);
    }

    // hier definiere ich die maximale Zahl
    public static void maximale(double nummer1, double nummer2, double nummer3) {
        double maxNummer = 0;

        if (nummer1 > nummer2 && nummer1 > nummer3) {
            maxNummer = nummer1;
        } else if (nummer2 > nummer1 && nummer2 > nummer3) {
            maxNummer = nummer2;
        } else if (nummer3 > nummer1 && nummer3 > nummer2) {
            maxNummer = nummer3;
        }

        System.out.println("Die maximale Zahl ist " + maxNummer);

    }

    // hier definiere ich die minimale Zahl
    public static void minimale(double nummer1, double nummer2, double nummer3) {
        double minNummer = 0;

        if (nummer1 < nummer2 && nummer1 < nummer3) {
            minNummer = nummer1;
        } else if (nummer2 < nummer1 && nummer2 < nummer3) {
            minNummer = nummer2;
        } else if (nummer3 < nummer1 && nummer3 < nummer2) {
            minNummer = nummer3;
        }

        System.out.println("Die minimale Zahl ist " + minNummer);
    }

    // hier definiere ich den Durschnitt
    public static void durschnitt(double nummer1, double nummer2, double nummer3) {
        double durschnitt = 0;

        durschnitt = (nummer1 + nummer2 + nummer3) / 3;

        System.out.println("Der Durschnitt ist " + durschnitt);
    }

}
