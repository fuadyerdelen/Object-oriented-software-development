package Übung6;

public class Gladiator {

    // Aufgabe 2.a

    private String _name;
    private int _at;
    private int _pa;
    private int _rs;
    private int _le;

    Waffe waffe;

    public Gladiator(String name) {
        // Aufgabe 2.b
        Wuerfel w6 = new Wuerfel(6);// ----> Hier rufen wir den Konstruktor der Klasse Wuerfel auf. (6 Seitige
                                    // Würfel)

        this.set_name(name);
        _at = 5 + w6.wuerfle();
        _pa = 5 + w6.wuerfle();
        this._rs = 0;
        set_le(30 + w6.wuerfle());

        this.waffe = Waffe.createWaffe(); // ----> Hier wird die Waffe des Gladiators erzeugt.

    }

    // Aufgabe 2.c

    public int get_le() {
        return _le;
    }

    public void set_le(int _le) {
        this._le = _le;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public boolean attacke() {
        Wuerfel w20 = new Wuerfel(20);// ----> Hier rufen wir den Konstruktor der Klasse Wuerfel auf. (20 Seitige
                                      // Würfel)

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

    public boolean nehmeSchaden(int tp) { // ----> Hier wird die Methode nehmeSchaden mit dem Parameter int tp
                                          // definiert.
        int schadenPunkte = tp - _rs; // ----> Hier wird die Variable schadenPunkte definiert. Sie ist gleich dem
                                      // Parameter tp - dem Attribut _rs.

        set_le(get_le() - schadenPunkte); // ----> Hier wird das Attribut _le um die Variable schadenPunkte reduziert.

        if (get_le() < 5 && get_le() > 0) { // ----> Wenn _le(Lebensenergie) kleiner als 5 ist, kann Gladiator nicht
            // kamfähig sein. Ich habe hier && _le > 0 geschrieben, weil wenn
            // _le(Lebensenergie) kleiner als 0 ist, ist Gladiator tot.

            System.out.println(this.get_name() + " ist kampfunfähig.");
            return false;

        } else if (get_le() <= 0) {// ----> Wenn _le(Lebensenergie) kleiner oder gleich 0
            // ist, ist Gladiator tot.

            System.out.println(this.get_name() + " ist tot.");
            return false;
        }
        return true;

    }

    public int calcTrefferPunkte() {
        // Rechnet die Trefferpunkte der Waffe aus.
        return this.waffe.calcTrefferPunkte();
    }

    // Aufgabe 2.f
    public static void main(String[] args) {

        // Erzeuge einen Gladiator mit dem Namen Maximus
        Gladiator gladiator = new Gladiator("Maximus");

        System.out.println(gladiator.attacke());
        System.out.println(gladiator.parade());
        System.out.println(gladiator.nehmeSchaden(100)); // ---> Maximus ist tot. :(
    }
}
