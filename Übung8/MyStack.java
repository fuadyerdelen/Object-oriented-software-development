package Übung8;

import Übung6.Gladiator;
import Übung6.Wuerfel;
import Übung7.Fahrrad;

// Aufgabe 2.a
public class MyStack extends MyAbstractContainer {
    // Aufgabe 2.b
    public MyStack(int capacity) {

        super(capacity);// ---> Der Konstruktor der Oberklasse wird aufgerufen
    }

    // Aufgabe 2.c
    public void push(Object obj) {

        if (size() == capacity()) {
            // Falls das Feld voll ist, ist, kommt eine Exception
            throw new RuntimeException("Stack ist voll");
        }
        _objs[size()] = obj;// ---> Das Object wird in der Feld gespeichert

        _size++;// ---> Die Anzahl derzeitige Object wird erhöht

    }

    // Aufgabe 2.d
    public Object pop() {

        // Das letzte Object wird in der Variable temp gespeichert
        Object obere = _objs[size() - 1];
        // Wenn ich den letzten Element mit null zuwiese, wird letzte Element gelöst
        _objs[size() - 1] = null;
        _size--;// ---> Die Anzahl derzeitige Object wird -1 gesetzt

        return obere;// ---> Das letzte Object wird zurückgegeben
    }

    // Aufgabe 2.e
    public static void main(String[] args) {

        // Zum Testen habe ich ein Objekt der Klasse Wuerfel und Gladiator angeruft

        Wuerfel Wuerfel6 = new Wuerfel(6);
        Gladiator gladiator = new Gladiator("Maximus");
        Fahrrad fahrrad = new Fahrrad("Salcano", 12);

        // Hier habe ich ein Object der Klasse MyStack mit der Kapazität 4 erzeugt
        MyStack deneme = new MyStack(4);

        // Hier habe ich die Methode push aufgerufen zum Testen
        deneme.push(Wuerfel6);
        deneme.push(gladiator);
        deneme.push(fahrrad);

        System.out.println(deneme.toString());

        // Hier habe ich die Methode pop aufgerufen zum Testen
        deneme.pop();
        System.out.println(deneme.toString()); // ---> Hier wird das Object fahrrad gelöscht

        /*
         * Im Aufgabeblatt steht beim pop eine Exception.
         * Aber es gibt beim pop Method keine Excepton
         */

    }

}
