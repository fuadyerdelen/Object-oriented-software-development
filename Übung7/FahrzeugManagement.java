package Übung7;

public class FahrzeugManagement {

    Fahrzeug[] fahrzeuge;

    public FahrzeugManagement() {
        /*
         * Hier habe ich die Fahrzeuge erstellt. (Fahrrad und Auto) damit ich sie testen
         * kann.
         */
        fahrzeuge = new Fahrzeug[] {
                new Fahrrad("Fahrrad 152", 0),
                new Fahrrad("Fahrrad 856", 100),
                new Auto("Auto 534", 0, 0),
                new Auto("Auto 469", 10000, 10000),
                new Auto("Auto 986", 20000, 20000)
        };
    }

    // rest habe ich nicht verstanden

}
