package Übung3;

public class Aufgabe6 {

    public static void main(String[] args) {

        System.out.println(karten(13));

    }

// Aufgabe 6.a
    public static int karten(int gesKarte) { // ----> ich habe die Karte, di wir suchen, als Parameter genommen

        int karten = 54; // -----> ganze Kartenstampel

        int anzKarten = 13; // -----> die Anzahl der Karten im Kartenstapel (die Herzkarten)

// Aufgabe 6.b
        for (int i = 0; i < anzKarten; i++) { // -----> 
            int derZeitigeKarte = i;
            if (gesKarte == derZeitigeKarte) {
                return i;
            }
        }
        return -1;

    }

}
