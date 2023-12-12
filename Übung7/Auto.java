package Übung7;

//Aufgabe 5

//Hier habe ich die Klasse Auto erstellt und die Klasse Fahrzeug implementiert.
public class Auto extends Fahrzeug implements IKraftstoffFahrzeug {

    private int kmLetzteInspekt;

    public Auto(String name, float kilometerstand, boolean belegt) {
        super(name, kilometerstand, belegt);

        
        this.kmLetzteInspekt += kmLetzteInspekt;
    }

}
