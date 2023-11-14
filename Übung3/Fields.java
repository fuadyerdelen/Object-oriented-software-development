package Übung3;

public class Fields {

    final static int LETZTE_ZAHL = 5;

    static void berechne(int[] erg) {
        for (int i = 0; i < erg.length; i++) {
            erg[i] = i * i;
        }
    }

    static void gibAus(int[] zahlen) {
        String s = "";
        for (int i = 0; i < zahlen.length; i++) {
            if (s.length() > 0) {
                s += ", ";
            }
            s += zahlen[i];
        }
        System.out.println("Zahlen: " + s);
    }

    public static void main(String[] args) {

        int[] feld = new int[LETZTE_ZAHL + 1]; // fel 5+1

        gibAus(feld); // ----> Zahlen 0,0,0,0,0,0
        berechne(feld);// ----> Zahlen 0,1,4,9,16,25
        gibAus(feld); 
    }
}