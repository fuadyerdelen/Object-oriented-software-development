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
        _gladiator1 = new Gladiator(gladiatorenNamen[w20Erg - 1], 12, 8, 0, 30);
        w20Erg = w20.wuerfle(); // ----> Hier musste ich nochmal würfeln, weil ich ein anderes Ergebnis brauche.
        _gladiator2 = new Gladiator(gladiatorenNamen[w20Erg - 1], 5, 5, 0, 65);

        System.out.println(_gladiator1._name + " vs " + _gladiator2._name);
    }

    // Aufgabe 3.d
    public boolean starteKampfRunde() {

        Wuerfel w6 = new Wuerfel(6);
        int w6Erg = w6.wuerfle();

        // Wenn Gladiator1 attack erfolgreich (ture) ist, gebe ich den Konsole X. Wenn
        // nicht -.
        System.out.println((_gladiator1.attacke() == true) ? "X" : "-");
        System.out.print((_gladiator2.parade() == true) ? "O" : "-");

        // Wenn Gladiator2 parade erfolgreich (ture) ist, gebe ich den Konsole O. Wenn
        // nicht -.
        System.out.println((_gladiator2.attacke() == true) ? "X" : "-");
        System.out.print((_gladiator1.parade() == true) ? "O" : "-");

        /*
         * Wenn ein Gladiator attack erfolgreich (ture) ist und andere Gladiator
         * paradiert nicht (false), dann nimmt Schaden mit w6Erg(Würfel mit 6-Seitigen).
         */
        if (_gladiator1.attacke() == true && _gladiator2.parade() == false) {

            _gladiator2.nehmeScahden(w6Erg);
            System.out.print(" " + w6Erg);
            return (_gladiator2.nehmeScahden(w6Erg) == false) ? true : false;

        } else if (_gladiator2.attacke() == true && _gladiator1.parade() == false) {
            _gladiator1.nehmeScahden(w6Erg);
            System.out.print(" " + w6Erg);
            return (_gladiator1.nehmeScahden(w6Erg) == false) ? true : false;

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
        while (arena.starteKampfRunde()) {

        }
        /*
         * Diese if-else Bedingung gibt den Namen des Gladiators, der tot ist.
         * Sie müssen am ende des Kampfes sein, weil wenn nicht, dann wird immer der
         * Name des Gladiators, der tot ist, gegeben.
         */
        if (arena._gladiator1._le < 0) {
            System.out.println(arena._gladiator1._name + " ist tot.");
        } else {
            System.out.println(arena._gladiator2._name + " ist tot.");
        }
    }

}
