
package Übung4;

import java.util.*;

public class Aufgabe2 {

    public static void main(String[] args) {
        // Aufgbabe 2.d
        // add(num());

        // Aufgabe 2.f
        // System.out.println(find(3));

        remove(3);
        System.out.println(remove(3));
        System.out.println("Erhaltene Feldwerte: ");

        for (int i = 0; i < feld.length; i++) {// ------> für Ausgabe von Array
            System.out.print(feld[i]);
            if (i < feld.length - 1) {
                System.out.print(", ");
            }
        }

    }

    // Aufgabe 2.c
    public static int num() {
        int zahl = 0;
        System.out.println("Gieb mir ein Zahl!!");
        Scanner scan = new Scanner(System.in);
        zahl = scan.nextInt();
        scan.close();
        return zahl;
    }

    // Aufgabe 2.a
    public static int[] feld = { 1, 2, 3, 4, 5 }; // new int[0]; ---> zum testen

    // Aufgabe 2.b
    public static void add(int z) {
        // neue Feld deklerieren(f1)
        int[] f1 = new int[feld.length + 1]; // ----> Ein Wert grösser als feld[]

        for (int i = 0; i < feld.length; i++) {
            f1[i] = feld[i]; // -------> Hier koppiere ich alle Werte von feld[] nach f1[]
        }
        f1[feld.length] = z; // -------> Hier weize ich letste Werte zu

        // System.out.println(f1[f1.length - 1]); //-----> zum testen
    }

    // Aufgabe 2.e
    public static int find(int z) {

        for (int i = 0; i < feld.length; i++) {

            if (z == feld[i]) { // ----> Wenn z gleich Element von feld
                return i; // -----> Index von z in feld
            }
        }

        return -1;
    }

    // Aufgabe 2.g
    public static boolean remove(int z) {

        int findIndex = find(z);

        int[] f1 = new int[feld.length - 1];

        // Koppie-schleife
        for (int i = 0; i < feld.length; i++) {

            if (i == findIndex) {
                f1[i+1] = feld[i];

                return true;
            }
            f1[i] = feld[i];
        }

        feld = f1;
        return false;
    }

}
