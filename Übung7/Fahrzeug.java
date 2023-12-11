package Übung7;

public class Fahrzeug {
    // 2.a Hier habe ich die Attribute erstellt.
    protected String name;
    protected float kilometerstand;
    protected boolean belegt;

    public Fahrzeug(String name, float kilometerstand, boolean belegt) {
        this.name = name;
        this.kilometerstand = kilometerstand;
        this.belegt = false;
    }

    // 2.b Hier habe ich die Methode erstellt.
    // Hier habe ich getter für die Attribute erstellt.
    public String getName() {
        return name;
    }

    public float getKilometerstand() {
        return kilometerstand;
    }

    public boolean getBelegt() {
        return belegt;
    }

    public int maxReichweite() {
        return 0;
    }

    public void belege() {

        if (belegt == true) {
            throw new IllegalStateException("Fahrzeug ist bereits belegt");
        } else {
            this.belegt = true;
        }
    }

    public void gebeFrei(float gefahreneKm) {

        if (belegt == false) {
            // Hier habe ich wenn das Fahrzeug nicht belegt ist, eine Exception gemacht.
            throw new IllegalStateException("Fahrzeug ist nicht belegt");
        } else {
            this.belegt = false;
            // Hier habe ich den Kilometerstand erhöht um die gefahrenen Kilometer.
            this.kilometerstand += gefahreneKm;
        }
    }

    public String toString() {
        return this.getClass().getName() + " " + name + ", Km: " + kilometerstand + ", Belegt: " + belegt;
    }

    @Override
    public boolean equals(Object obj) {
        // Hier habe ich fahrzeug erstellt, damit ich in obj die Attributen von Fahrzeug geben kann.    
        Fahrzeug fahrzeug = (Fahrzeug) obj;
    
        if (obj == this && fahrzeug.name.equals(this.name) && fahrzeug.kilometerstand == this.kilometerstand) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        return name.hashCode() + 11 * Float.hashCode(kilometerstand);
    }

}
