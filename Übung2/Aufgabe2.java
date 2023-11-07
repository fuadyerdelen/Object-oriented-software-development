import java.util.Scanner;

public class Aufgabe2 {

    public static void main(String[] args) {
// Hier setze ich die Variablen.
        int tag = 0;
        int m = 0;
        int j = 0;
// Hier benutze ich Scanner, um die Zahlen von der Tastatur zu lesen.
        Scanner scan = new Scanner(System.in);
// Hier lese ich die Zahlen von der Tastatur.
        System.out.println("Tippen Sie bitte der Tag");
        tag = scan.nextInt();
        System.out.println("Tippen Sie bitte das Monat");
        m = scan.nextInt();
        System.out.println("Tippen Sie bitte der Jahr");
        j = scan.nextInt();

        int w = 0;

// Hier nutze ich die Berechnung der Wochentage.
        w = (tag + 2 * m + (3 * m + 3) / 5 + j + j / 4 - j / 100 + j / 400 + 1) % 7;

        if ((m <= 2) && (j <= 2)) {

            m += 12;
            j -= 1;
        }
// Hier setze ich die Variable Wochentage als String.
        String wochenTage;

// Hier gebe ich die Wochentage aus.
        switch (w) {
            case 0:
                wochenTage = "Sonntag";
                System.out.println("Der " + tag + "." + m + "." + j + " ist ein " + wochenTage);
                break;
            case 1:
                wochenTage = "Montag";
                System.out.println("Der " + tag + "." + m + "." + j + " ist ein " + wochenTage);
                break;
            case 2:
                wochenTage = "Dienstag";
                System.out.println("Der " + tag + "." + m + "." + j + " ist ein " + wochenTage);
                break;
            case 3:
                wochenTage = "Mittwoch";
                System.out.println("Der " + tag + "." + m + "." + j + " ist ein " + wochenTage);
                break;
            case 4:
                wochenTage = "Donnerstag";
                System.out.println("Der " + tag + "." + m + "." + j + " ist ein " + wochenTage);
                break;
            case 5:
                wochenTage = "Freitag";
                System.out.println("Der " + tag + "." + m + "." + j + " ist ein " + wochenTage);
                break;
            case 6:
                wochenTage = "Samstag";
                System.out.println("Der " + tag + "." + m + "." + j + " ist ein " + wochenTage);
                break;
        }

    }
}
