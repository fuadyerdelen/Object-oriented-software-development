package Übung8;

import Übung6.Gladiator;
import Übung6.Wuerfel;
import Übung7.Fahrrad;

// Aufgabe 3.a
public class MyList extends MyAbstractContainer {

    // Aufgabe 3.b
    public MyList(int capacity) {

        super(capacity);// ---> Der Konstruktor der Oberklasse wird aufgerufen
    }

    // Aufgabe 3.c
    public void add(Object obj) {
        ensureObjsHasSpace();

        // Das Object wird in der Feld gespeichert
        _objs[size()] = obj;
        _size += 1; // ---> Die Anzahl derzeitige Object wird erhöht

    }

    private void ensureObjsHasSpace() {
        if (size() >= capacity()) {
            // Falls das Feld voll ist, erzeuge ich ein neues Feld mit der doppelten Größe
            Object[] neueObj = new Object[capacity() * 2];

            // Hier wird die Inhalt _obj in die neue Feld neueObj gespeichert
            for (int i = 0; i < capacity(); i++) {
                neueObj[i] = _objs[i];
            }
            _objs = neueObj;// _objs wird auf die neue Feld neueObj gesetzt
        }
    }

    // Aufgabe 3.d
    public boolean remove(Object obj) {

        int target = find(obj);

        // Wenn das Objekt nicht gefunden wird, wird false zurückgegeben
        if (target == -1) {
            return false;
        }

        // Wenn ich die Objekt finde, wird das Objekt gelöscht und die Elemente eins
        // nach vorne kopiert
        for (int i = target + 1; i < size(); i++) {
            // Ich habe hier target + 1 geschrieben, weil ich das Objekt, das ich löschen will
            _objs[i - 1] = _objs[i];

            // um verstendlich zu machen, habe ich so geschrieben
            // _objs[0] =_objs[1]
            // _objs[1] =_objs[2]

        }
        _objs[size() - 1] = null; // --> der letzte Element habe ich null zugewiesen, weil die nicht mehr ist
        _size--; // ---> Die Anzahl derzeitige Object wird -1 gesetzt

        return true;
    }

    // Aufgabe 3.e
    public static void main(String[] args) {

        Wuerfel Wuerfel6 = new Wuerfel(6);
        Gladiator gladiator = new Gladiator("Maximus");
        Fahrrad fahrrad = new Fahrrad("Salcano", 12);

        // Hier habe ich ein Object der Klasse MyStack mit der Kapazität 4 erzeugt
        MyList deneme = new MyList(4);

        // Hier habe ich die Methode push aufgerufen zum Testen
        deneme.add(Wuerfel6);
        deneme.add(gladiator);
        deneme.add(fahrrad);

        System.out.println(deneme.toString());

        // Hier habe ich die Methode pop aufgerufen zum Testen
        deneme.remove(gladiator);
        System.out.println(deneme.toString());
    }

}
