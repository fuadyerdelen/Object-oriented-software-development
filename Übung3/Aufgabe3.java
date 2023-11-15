package Übung3;

public class Aufgabe3 {

    // Aufgabe3.a
    static void sumEvenNums(int z) {
        int ergebnis = 0;
        for (int i = 1; i <= z; i++) {

            ergebnis += i; // ergebnis = ergebnis + i;
        }
        System.out.println(ergebnis);

    }

    // Aufgabe3.b
    static int sumEvenOrOddNums(int z, boolean blnSumOdds) {
        int erg = 0;

        for (int i = 1; i <= z; i++) {
            // Hier defienire ich if bedingung für die blnSumOdds, ob es true oder false ist
            if (blnSumOdds == true) {
                // Wenn es false ist addiere ich den alle gerade Zahlen bis Varieable z
                if (i % 2 != 0) {
                    erg += i; // erg = erg + i;
                }
                // Hier defienire ich if bedingung für die blnSumOdds, ob es true oder false ist

            } else if (blnSumOdds == false) {
                // Wenn es false ist addiere ich den alle ungerade Zahlen bis Varieable z
                if (i % 2 == 0) {
                    erg += i; // erg = erg + i;
                }

            }
        }

        return erg;

    }

    // In main Method rufe ich den Methoden mit Paremeters auf
    public static void main(String[] args) {
        sumEvenNums(78);
        sumEvenOrOddNums(9, true);
    }

}
