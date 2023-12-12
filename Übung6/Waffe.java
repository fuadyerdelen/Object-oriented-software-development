package Übung6;

public class Waffe {
    // Hier haben wir ein Enum, das die Waffentypen enthält.
    enum Waffentyp {
        Hand, Kurzschwert, Schwert, Speer, Dreizack, Peitsche
    }

    private Waffentyp _typ;

    private Waffe(Waffentyp typ) {
        // Hier haben wir einen Konstruktor, der ein Waffentyp als Parameter nimmt.
        this._typ = typ;
    }

    public int calcTrefferPunkte() {
        // Hier wird das Ergebnis des Würfels in der Variable w6Ergebnis gespeichert.
        Wuerfel w6 = new Wuerfel(6);
        
        switch (_typ) { // Hier nehmen wir den Waffentyp als Parameter, um die Trefferpunkte zu berechnen.
            case Hand:
            // Wenn Gladiatoren mit der Hand angreifen, geben wir nur das Ergebnis des Würfels zurück.
                return w6.wuerfle(); 
            case Kurzschwert:
            // Wenn Gladiatoren mit dem Kurzschwert angreifen, geben wir das Ergebnis des Würfels + 2 zurück.
                return w6.wuerfle() + 2; 
            case Schwert:
            // Wenn Gladiatoren mit dem Schwert angreifen, geben wir das Ergebnis des Würfels + 4 zurück.
                return w6.wuerfle() + 4;    
            case Speer:
            // Wenn Gladiatoren mit dem Speer angreifen, geben wir das Ergebnis des Würfels + 3 zurück.
                return w6.wuerfle() + 3;    
            case Dreizack:
            // Wenn Gladiatoren mit dem Dreizack angreifen, geben wir das Ergebnis des Würfels + 5 zurück.
                return w6.wuerfle() + 5;    
            case Peitsche:
            // Wenn Gladiatoren mit der Peitsche angreifen, geben wir das Ergebnis des Würfels + 1 zurück.
                return w6.wuerfle() + 1;    
            default:
                throw new RuntimeException("Kein Waffentyp!");
        }
    }

    public static Waffe createWaffe() {
        // Hier rufen wir den Konstruktor der Klasse Würfel auf. (6 Seitige Würfel)
        Wuerfel w6 = new Wuerfel(6);

        switch (w6.wuerfle()) { //Hier nimmt switch das Ergebnis des Würfels als Parameter.
            case 1:
                return new Waffe(Waffentyp.Hand);
            case 2:
                return new Waffe(Waffentyp.Kurzschwert);
            case 3:
                return new Waffe(Waffentyp.Schwert);
            case 4:
                return new Waffe(Waffentyp.Speer);
            case 5:
                return new Waffe(Waffentyp.Dreizack);
            case 6:
                return new Waffe(Waffentyp.Peitsche);
        }
        return null;
    }

    public Waffentyp getTyp() {
        // Hier geben wir den Waffentyp zurück.
        return _typ;
    }
}
