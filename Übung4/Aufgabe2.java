
package Übung4;

import java.util.Scanner;

public class Aufgabe2 {

    // Aufgbabe 2.d
    public static void main(String[] args) {
        //add(num());

        System.out.println(find(3));
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
    public static int[] feld = new int[0]; //{ 1, 2, 3, 4, 5 }; ---> zum testen

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

    //Aufgabe 2.e
    public static int find(int z) {

        for (int i = 0; i < feld.length; i++) {

            if (z == feld[i]) { // ----> Wenn z gleich Element von feld
                return i + 1; // -----> Index von z in feld "i+1", weil Arrays immer mit 0 beginnen
            }
        }

        return -1;
    }



}
