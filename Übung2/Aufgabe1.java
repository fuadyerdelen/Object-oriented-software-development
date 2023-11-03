import java.util.Scanner;

public class Aufgabe1 {

    public static void main(String args[]) {

        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Geben Sie mir bitte drie Zahlen ...");
            int nummer1 = scan.nextInt();
            int nummer2 = scan.nextInt();
            int nummer3 = scan.nextInt();

            int maxNummer = 0;

            if (nummer1 > nummer2 && nummer1 > nummer3) {
                maxNummer = nummer1;
            } else if (nummer2 > nummer1 && nummer2 > nummer3) {
                maxNummer = nummer2;
            } else if (nummer3 > nummer1 && nummer3 > nummer2) {
                maxNummer = nummer3;
            }

            System.out.println("die maximale Zahl ist  " + maxNummer);

        } catch (Exception e) {

            System.out.println("Fehler: " + e.getMessage());
        }

    }
}
