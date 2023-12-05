package Übung6;

public class Gladiator {

    // Aufgabe 2.a

    String _name;
    int _at;
    int _pa;
    int _rs;
    int _le;

    public Gladiator(String name, int at, int pa, int rs, int le) {
        // Aufgabe 2.b
        Wuerfel w6 = new Wuerfel(6);// ----> Hier rufen wir den Konstruktor der Klasse Wuerfel auf. (6 Seitige Würfel)

        _name = name;
        _at = 5 + w6.wuerfle();
        _pa = 5 + w6.wuerfle();
        _rs = 0;
        _le = 30 + w6.wuerfle();

    }

    // Aufgabe 2.c

    public boolean attacke() {
        Wuerfel w20 = new Wuerfel(20);// ----> Hier rufen wir den Konstruktor der Klasse Wuerfel auf.

        int w20Ergebnis = w20.wuerfle(); // ----> Hier speichern wir das Ergebnis des Würfels in der Variable
                                         // w20Ergebnis.

        if (w20Ergebnis <= _at) { // ----> Hier vergleichen wir das Ergebnis des Würfels mit dem Attribut _at.
            return true;// ----> Hier geben wir true zurück, wenn das Ergebnis des Würfels kleiner oder
                        // gleich dem Attribut _at ist.
        } else {
            return false; // ----> Hier geben wir false zurück, wenn das Ergebnis des Würfels größer als
                          // das Attribut _at ist.
        }
    }

    // Aufgabe 2.d

    public boolean parade() {
        Wuerfel w20 = new Wuerfel(20);// ----> Hier rufen wir den Konstruktor der Klasse Wuerfel auf.

        int w20Ergebnis = w20.wuerfle(); // ----> Hier speichern wir das Ergebnis des Würfels in der Variable
                                         // w20Ergebnis.

        if (w20Ergebnis <= _pa) { // ----> Hier vergleichen wir das Ergebnis des Würfels mit dem Attribut _pa.
            return true;// ----> Hier geben wir true zurück, wenn das Ergebnis des Würfels kleiner oder
                        // gleich dem Attribut _pa ist.
        } else {
            return false; // ----> Hier geben wir false zurück, wenn das Ergebnis des Würfels größer als
                          // das Attribut _pa ist.
        }
    }

    // Aufgabe 2.e

    public boolean nehmeScahden(int tp) { // ----> Hier wird die Methode nehmeSchaden mit dem Parameter int tp
                                          // definiert.

        if (_le < 5) { // ----> Wenn _le(Lebensenergie) kleiner als 5 ist, kann Gladiator nicht
                       // kamfähig sein.

            System.out.println(this._name + " ist kampfunfähig.");
            return false;
        } else if (_le <= 0) {// ----> Wenn _le(Lebensenergie) kleiner oder gleich 0
                              // ist, ist Gladiator tot.

            System.out.println(this._name + " ist tot.");
            return false;
        }
        return true;

    }

    // Aufgabe 2.f

    public static void main(String[] args) {

        // Erzeuge einen Gladiator mit dem Namen Maximus
        Gladiator gladiator = new Gladiator("Maximus", 5, 5, 0, 30);

        System.out.println(gladiator.attacke());
        System.out.println(gladiator.parade());
        System.out.println(gladiator.nehmeScahden(0));
    }
}
