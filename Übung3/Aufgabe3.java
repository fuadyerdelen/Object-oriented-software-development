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
    static void sumEvenOrOddNums(int z, boolean blnSumOdds) {
        int erg = 0;

        for (int i = 1; i <= z; i++) {
            if (blnSumOdds == true) {
                if (i % 2 == 0) {
                    erg += i; 
                }
				
            } else if (blnSumOdds == false) {
                if (i % 2 != 0) {
                    erg += i;
                }
				
            }
        }

        System.err.println(erg);

    }

    public static void main(String[] args) {
        sumEvenNums(6);
        sumEvenOrOddNums(9, true);
    }

}
