package Übung3;

public class Fields {

    final static int LETZTE_ZAHL = 5;

    //Hier 2 Methoden, die ich in main Methode aufrufe
    //erste Methode berechne macht ein Array mit 6 Elementen, die die Quadratzahlen von 0 bis 5 sind
    static void berechne(int[] erg) {
        for (int i = 0; i < erg.length; i++) {
            erg[i] = i * i;
        }
    }

    //zweite Methode gibAus gibt die Zahlen  
    static void gibAus(int[] zahlen) {
        String s = "";
        for (int i = 0; i < zahlen.length; i++) {// ich habe das neue gelernt, dass ich die Länge von Array ".length", die Länge von Variablen ".length()" schreiben muss.
            if (s.length() > 0) { //------> warum s.length()
                s += ", "; //---> s= s + ", ";
            }
            s += zahlen[i]; //----> s= s + zahlen[i];
        }
        System.out.println("Zahlen: " + s);
    }

    public static void main(String[] args) {

        int[] feld = new int[LETZTE_ZAHL + 1]; // fel 5+1 = 6

        gibAus(feld); // ----> Zahlen 0,0,0,0,0,0
        berechne(feld);// ----> Zahlen 0,1,4,9,16,25
        gibAus(feld); // ----> ich habe das nicht verstanden, warum e es nicht funktioniert wurde.
    }
}