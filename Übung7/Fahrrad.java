package Übung7;

public class Fahrrad extends Fahrzeug {

    public Fahrrad(String name, float kilometerstand, boolean belegt) {
        /*
         * Hier habe ich den Konstruktor mit super erstellt. Damit ich die Attribute von
         * der oberen Klassen ausgleichen kann.
         */
        super(name, kilometerstand, belegt);
    }

    // Hier schreibe ich die Methode maxReichweite() über.
    @Override
    public int maxReichweite() {
        return 5; // ---->aber hier habe ich die Reichweite von Fahrrad auf 5 gesetzt statt 0.
    }

}
