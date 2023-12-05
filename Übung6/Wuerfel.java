package Übung6;

public class Wuerfel {
    // Attribute
    private int _seiten;  //---> Es ist private, weil es nur in der Klasse Wuerfel benutzt wird.

    // Konstruktor
    public Wuerfel(int seiten) {//----> Hier wird ein Konstruktor der Klasse Wuerfel definiert. Das hilft uns, ein Objekt der Klasse Wuerfel zu erzeugen.
        _seiten = seiten;  //----> Hier speichern wir die Anzahl der Seiten in der Variable _seiten.
    }

    // Methode zum Würfeln
    public int wuerfle() {
        return (int) (Math.random() * _seiten) + 1;// -----> (int) (Math.random() * _seiten) gibt eine zufällige Zahl zwischen 0 und _seiten zurück.
                                                  // -----> (int) (Math.random() * _seiten) + 1 gibt eine zufällige Zahl zwischen 1 und _seiten + 1 zurück.
    }

    // Hauptmethode zum Testen
    public static void main(String[] args) {
        // Erzeuge einen 6-seitigen Würfel
        Wuerfel Wuerfel6 = new Wuerfel(6); //-----> Hier wird ein Objekt der Klasse Wuerfel erzeugt.

        // Würfele und gebe Ergebnisse aus
        System.out.println("Ergebnisse des 6-seitigen Würfels:");

        System.out.println(Wuerfel6.wuerfle());
        System.out.println(Wuerfel6.wuerfle());
        System.out.println(Wuerfel6.wuerfle());

        // Erzeuge einen 20-seitigen Würfel
        Wuerfel Wuerfel20 = new Wuerfel(20);  //-----> Hier wird ein Objekt der Klasse Wuerfel erzeugt.

        // Würfele und gebe Ergebnisse aus
        System.out.println("\nErgebnisse des 20-seitigen Würfels:");
        System.out.println(Wuerfel20.wuerfle());
        System.out.println(Wuerfel20.wuerfle());
        System.out.println(Wuerfel20.wuerfle());

    }
}
