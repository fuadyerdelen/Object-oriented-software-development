package Übung7;

//Aufgabe 5

//Hier habe ich die Klasse Auto erstellt und die Klasse Fahrzeug implementiert.
public class Auto extends Fahrzeug implements IKraftstoffFahrzeug {

    private int kmLetzteInspekt;

    public Auto(String name, float kilometerstand, int kmLetzteInspekt) {
        super(name, kilometerstand);

        this.kmLetzteInspekt = kmLetzteInspekt;

    }

    @Override
    public int maxReichweite() {
        // Hier habe ich die Reichweite von Auto auf 700 gesetzt statt 0.
        return 700;
    }

    @Override
    public boolean brauchtInspektion() {
        /*
         * Wenn kmLetzteInspekt + 20000 < kilometerstand ist, dann braucht das Auto eine
         * Inspektion.
         */

        if (kmLetzteInspekt + 20000 < kilometerstand) {
            return true;
        }
        return false;
    }

    @Override
    public void inspektionDurchgeführt() {
        kmLetzteInspekt = (int) kilometerstand;
        /*
         * hier habe ich den Kilometerstand in int umgewandelt, weil
         * ein int ist.
         */
    }

    @Override
    public String toString() {
        /*
         * Hier habe ich die toString Methode von der oberen Klasse (Fahrzeug)
         * übernommen und
         * + KmLI: kmLetzteInspekt hinzugefügt.
         */
        return super.toString() + ", KmLI: " + kmLetzteInspekt;
    }

}
