package Übung3;

public class Aufgabe4 {

    // In main methode rufe ich den Methoden mit Parameters auf
    public static void main(String[] args) {

        System.out.println(sumEvenNumsRecursive(6));// -----> 21
        System.out.println(sumEvenOrOddNumsRecursive(9, true));// -----> 20
    }

    // Aufgabe4.a
    static int sumEvenNumsRecursive(int counter) {
        if (counter == 0) {
            return 0;
        } else {
            // Hier habe ich meine rekursive Methode zum caunter-Parameter hinzugefügt, um die Summe der geraden Zahlen
            // mit dem nächsten Ergebnis zu sammeln.
            return counter + sumEvenNumsRecursive(counter - 1);
        }
    }

    // Aufgabe4.b
    static int sumEvenOrOddNumsRecursive(int counter, boolean blnSumOdds) {
        if (counter == 0) {
            return 0;
            // in hier addiere ich den alle gerade Zahlen bis Varieable z 
        } else if (blnSumOdds) { // ----> Das funktioniert, weil wenn blnSummOdds "false" ist, geht die Bedingung nach else
                                 
            if (counter % 2 == 0) {
                return counter + sumEvenOrOddNumsRecursive(counter - 1, true);
            } else {
                return sumEvenOrOddNumsRecursive(counter - 1, true);
            }
            // in hier addiere ich den alle ungerade Zahlen bis Varieable z
        } else {// ----> Wenn blnSummOdds "false" ist
            if (counter % 2 != 0) {
                return counter + sumEvenOrOddNumsRecursive(counter - 1, false);
            } else {
                return sumEvenOrOddNumsRecursive(counter - 1, false);
            }
        }
    }

}
