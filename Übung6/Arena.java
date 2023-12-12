package Übung6;

public class Arena {
    // Aufgabe 3.a
    // Hier haben wir ein Array von String, das die Namen der Gladiatoren
    // geschrieben.
    private static String[] gladiatorenNamen = {
            "Spartacus",
            "Commodus",
            "Marcus Attilius",
            "Flamma",
            "Crixus",
            "Verus",
            "Priscus",
            "Tetraites",
            "Hermes",
            "Carpophorus",
            "Secutor",
            "Retiarius",
            "Dimachaerus",
            "Bestiarius",
            "Murmillo",
            "Thraex",
            "Myrmillo",
            "Laquearius",
            "Sagittarius",
            "Andabatus"
    };

    // Aufgabe 3.b
    // 2 Attribute vom Gladiator
    Gladiator _gladiator1;
    Gladiator _gladiator2;

    public Arena() {
        // Aufgabe 3.c
        Wuerfel w20 = new Wuerfel(20);// ----> Hier rufen wir den Konstruktor der Klasse Würfel (20-Seiteigen) auf

        int w20Erg = w20.wuerfle(); // ----> Hier speichern wir das Ergebnis von Würfel (20-Seiteigen)

        // hier wird ein Objekt der Klasse Gladiator erzeugt. Die Attribute habe ich
        // zuverlessig gestellt.
        _gladiator1 = new Gladiator(gladiatorenNamen[w20Erg - 1]);
        w20Erg = w20.wuerfle(); // ----> Hier musste ich nochmal würfeln, weil ich ein anderes Ergebnis brauche.
        _gladiator2 = new Gladiator(gladiatorenNamen[w20Erg - 1]);

        System.out.println(_gladiator1.get_name() + " vs " + _gladiator2.get_name());
        System.out.println();
    }

    // Aufgabe 3.d
    public boolean starteKampfRunde(Gladiator angr, Gladiator vert) {

        // boolean kampffaehig = true;

        // diese Wuerfelmethoden sind nicht mehr notwendig, weil wir die Methode aus der Klasse Waffe benutzen.
        
        //Wuerfel w6 = new Wuerfel(6);
        //int w6Erg = w6.wuerfle();

        String angrStr = "-";
        String vertStr = "-";
        boolean hitSuccessful = false;

        int schaden = 0;

        // Wenn Gladiator1 attack erfolgreich (ture) ist, gebe ich den Konsole X. Wenn
        // nicht -.
        if (angr.attacke()) {
            angrStr = "X";

            if (vert.parade()) {
                vertStr = "O";
            } else {
                hitSuccessful = true;
            }
        }

        // Wenn Gladiator2 parade erfolgreich (ture) ist, gebe ich den Konsole O. Wenn
        // nicht -.
        if (angr == _gladiator1) {
            System.out.printf("%-20s%-20s", angrStr, vertStr);
        } else {
            System.out.printf("%-20s%-20s", vertStr, angrStr);
        }
        /*
         * Wenn ein Gladiator attack erfolgreich (ture) ist und andere Gladiator
         * paradiert nicht (false), dann nimmt Schaden mit w6Erg(Würfel mit 6-Seitigen).
         */
        if (hitSuccessful) {

            // Schadensberechnung
            schaden = angr.waffe.calcTrefferPunkte();
            System.out.println(schaden);

            if (!vert.nehmeSchaden(schaden)) {
                return false;
            }
        } else {
            System.out.println();
        }

        return true;
    }

    public static void main(String[] args) {
        // Aufgabe 3.e
        Arena arena = new Arena();

        // Aufgabe 3.f
        /*
         * Hier wird die Methode starteKampfRunde() so lange aufgerufen bis ein
         * Gladiator tot oder kampfunfähig ist. Das heißt, dass die Methode
         * starteKampfRunde() solange aufgerufen wird, bis sie false zurückgibt.
         */
        while (arena.starteKampfRunde(arena._gladiator1, arena._gladiator2)) {

        }
        
    }

}
