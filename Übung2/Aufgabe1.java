import java.util.Scanner;

public class Aufgabe1 {

    public static void main(String args[]) {

// Hier probiere ich try-catch zu benutzen, um die Fehlermeldung zu vermeiden.

        try {
// Hier benutze ich Scanner, um die Zahlen von der Tastatur zu lesen.
            Scanner scan = new Scanner(System.in);
            scan.close();
            System.out.println("Geben Sie mir bitte drie Zahlen ...");
// Hier lese ich die Zahlen von der Tastatur.
            int nummer1 = scan.nextInt();
            int nummer2 = scan.nextInt();
            int nummer3 = scan.nextInt();

            int maxNummer = 0;
// Hier vergleiche ich die Zahlen.
            if (nummer1 > nummer2 && nummer1 > nummer3) {
                maxNummer = nummer1;
            } else if (nummer2 > nummer1 && nummer2 > nummer3) {
                maxNummer = nummer2;
            } else if (nummer3 > nummer1 && nummer3 > nummer2) {
                maxNummer = nummer3;
            }
// Hier gebe ich die maximale Zahl aus.
            System.out.println("die maximale Zahl ist  " + maxNummer);

        } catch (Exception e) {

            System.out.println("Fehler: " + e.getMessage());
        }

    }
}
