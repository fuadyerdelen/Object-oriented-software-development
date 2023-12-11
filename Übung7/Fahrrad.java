package Übung7;

public class Fahrrad extends Fahrzeug {
    public Fahrrad(String name, float kilometerstand, boolean belegt) {
        super(name, kilometerstand, belegt);
    }

    @Override
    public int maxReichweite() {
        return 15;
    }

}
