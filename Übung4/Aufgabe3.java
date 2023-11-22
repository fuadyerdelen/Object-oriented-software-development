package Übung4;

import java.util.Arrays;
import java.util.Collections;

public class Aufgabe3 {

    public static void main(String[] args) {

        System.out.println(karten("Herz-König")); // ----->8
        System.out.println(karten("Herz-8")); // ----> 3

        // Aufgabe 3.c
        System.out.println(lexikalischeSuche("Herz-König")); // ----->8
        System.out.println(lexikalischeSuche("Herz-8")); // ----> 3

        bubleSucht("Herz-König");

        /*
         * gesamteKarte();
         * System.out.println(karten[13]);
         */
    }

    /*
     * ich machte sie als public static,
     * weil ich sie beim mehrere Methoden benutzen will
     */

    // -----> ganze Kartenstampel
    public static String[] karten = new String[53];

    // -----> Die Karten im Kartenstapel (die Herzkarten)
    public static String[] anzKarten = { "Herz-6", "Herz-7", "Herz-8", "Herz-9", "Herz-10", "Herz-Bube", "Herz-Dame",
            "Herz-König", "Herz-As" };

    // -----> Es steht nicht in der Aufgabe, aber ich wollte es machen
    public static void gesamteKarte() {
        // Mit dieser Methode fülle ich den Herzkarten in der ganzen Kartenstapel
        for (int i = 6; i < 15; i++) {
            karten[i] = anzKarten[i - 6]; // -->nur die Herzkarten (6 bis 14)
        }
    }

    // -----> Aufgabe 3.a
    public static int karten(String gesKarte) {

        for (int i = 0; i < anzKarten.length; i++) {

            if (anzKarten[i] == gesKarte) { // ------> Wenn ich die gesuchte Karte finde
                return i + 1; // ------> gebe ich die Indexnummer von der gesuchten Karte zurück
                // (+1, weil es bei 0 anfängt)
            }
        }
        return -1;
    }

    // -----> Aufgabe 3.b
    public static int lexikalischeSuche(String gesKarte) {
        /*
         * Das habe ich im Internet gefunden, mit Array.binarySearch() methode lernen
         * wir Index von gesuchten Karte
         */
        int index = Arrays.binarySearch(anzKarten, gesKarte) + 1;

        if (anzKarten[(anzKarten.length + 1) / 2] == gesKarte) {
            return (anzKarten.length + 1) / 2;

        } else if (index < (anzKarten.length + 1) / 2) { // -----> Wenn die gesuchte Karte in der ersten Hälfte ist
            // Suche in der ersten Hälfte. Deshalb begint die Schleife mit 0
            for (int i = 0; i < (anzKarten.length + 1) / 2; i++) {
                if (anzKarten[i] == gesKarte) {
                    return i + 1;
                }
            }
        } else if (index > (anzKarten.length + 1) / 2) { // -----> Wenn die gesuchte Karte in der zweiten Hälfte ist
            // Suche in der zweiten Hälfte. Deshalb begint die Schleife mit
            // (anzKarten.length + 1) / 2
            for (int i = (anzKarten.length + 1) / 2; i < anzKarten.length; i++) {
                if (anzKarten[i] == gesKarte) {
                    return i + 1;
                }
            }
        }
        return -1;
    }

    // -----> Aufgabe 3.d
    public static void bubleSucht(String gesKarte) {
        // -----> Ich habe die Methode im Internet gefunden. Damit kann ich die
        // Kartenstapel mischen
        Collections.shuffle(Arrays.asList(anzKarten));

        // ich fange mit 1 an, weil ich bei 0 mit j-1 erreiche
        for (int i = 1; i < anzKarten.length; i++) {
            // -----> Ich fange mit der letzten Karte an, weil ich mit j-1 erreiche
            for (int j = anzKarten.length - 1; j >= i; j--) {
                // -----> Wenn die gesuchte Karte kleiner als die vorherige Karte ist
                if (Arrays.binarySearch(anzKarten, gesKarte) < Arrays.binarySearch(anzKarten, anzKarten[j - 1])) {
                    String temp = anzKarten[j];
                    anzKarten[j] = anzKarten[j - 1];
                    anzKarten[j - 1] = temp;
                }
            }
        }

    }

}
