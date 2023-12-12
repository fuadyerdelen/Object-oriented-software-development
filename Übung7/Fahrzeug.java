package Übung7;

public class Fahrzeug {
    // 2.a
    // Hier habe ich die protecte Attribute erstellt.
    protected String name;
    protected float kilometerstand;
    protected boolean belegt;

    // Hier habe ich den Konstruktor erstellt.
    public Fahrzeug(String name, float kilometerstand, boolean belegt) {
        this.name = name;
        this.kilometerstand = kilometerstand;
        this.belegt = false;
    }

    // 2.b
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
            /*
             * Hier habe throw gemacht um eine Exception zu machen, wenn das Fahrzeug schon
             * belegt ist.
             */
            throw new IllegalArgumentException("Fahrzeug ist schon belegt!");
        } else {
            this.belegt = true;
        }
    }

    public void gebeFrei(float gefahreneKm) {

        if (belegt == false) {
            // Hier habe ich wenn das Fahrzeug nicht belegt ist, eine Exception gemacht.
            throw new IllegalArgumentException("Fahrzeug ist nicht belegt!");
        } else {
            this.belegt = false;
            // Hier habe ich den Kilometerstand erhöht um die gefahrenen Kilometer.
            this.kilometerstand += gefahreneKm;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " " + name + ", Km: " + kilometerstand + ", Belegt: " + belegt;
    }

    @Override
    public boolean equals(Object obj) {
        /*
         * Hier habe ich fahrzeug erstellt, damit ich in obj die Attributen von Fahrzeug
         * vergleichen kann.
         */
        Fahrzeug fahrzeug = new Fahrzeug(name, kilometerstand, belegt);

        // Hier habe ich die Attribute von Fahrzeug verglichen.
        if (obj instanceof Fahrzeug && fahrzeug.name.equals(this.name)
                && fahrzeug.kilometerstand == this.kilometerstand) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        /*
         * Hier habe ich hashCode erstellt.
         * Ich habe die hashCode von name und mit 11 multiplizierte kilometerstand
         * addiert.
         */
        return name.hashCode() + 11 * Float.hashCode(kilometerstand);
        /*
         * -----> hier habe ich
         * Float.hashCode(kilometerstand) gemacht, weil
         * kilometerstand float ist.
         */
    }

}
