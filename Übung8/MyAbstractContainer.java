package Übung8;

// Aufgabe 1.a
// Ich habe eine abstrakte Klasse geschrieben.
abstract public class MyAbstractContainer {

    protected Object[] _objs;//
    protected int _size;// ---> Die Anzahl derzeitige Object

    // Definition von Konstruktor
    public MyAbstractContainer(int capacity) {

        this._objs = new Object[capacity];
        this._size = 0;
    }

    // Aufgabe 1.d.a
    public int capacity() {
        return _objs.length; // ---> Die Anzahl der Object, die in der Array gespeichert werden können
    }

    // Aufgabe 1.d.b
    public int size() {
        return _size;
    }

    // Aufgabe 1.d.c
    public Object get(int index) {
        if (index < 0 || index > _objs.length) {
            // ---> Wenn der Index kleiner als 0 oder größer als die Anzahl der Object ist,
            // dann wird eine Exception geworfen
            throw new RuntimeException("Kein gültüger Index");
        }
        return _objs[index];
    }

    public int find(Object obj) {

        for (int i = 0; i < _objs.length; i++) {

            if (_objs[i].equals(obj)) { // ---> Wenn der Inhalt des Objekts gleich dem Inhalt des Objekts ist, dann wird
                                        // der Index zurückgegeben

                return i;
            }
        }
        // Wenn nicht, wird -1 zurückgegeben
        return -1;
    }

    @Override
    public String toString() {
        String string;

        // Hier wird die Name der Klasse, die Anzahl der Object, die in der Array
        // gespeichert werden können und die Anzahl derzeitige Object ausgegeben
        string = this.getClass().getSimpleName() + " (Cap: " + capacity() + ", Size: " + size() + "):";
        for (int i = 0; i < size(); i++) {
            // hier wird die toString-Methode von der Klasse Objject geliestet
            string += "\n" + _objs[i].getClass().getSimpleName();

            /*
             * Hier habe ich to String benutzt, die Ogjecte zu listen. Aber die ich finde
             * besser wenn ich einfach getSimpleName nutze. Es wird mehr verständlich
             * Aber die Aufgabe ist so geschrieben, dass wir die toString-Methode nutzen müssen
             */

             // ich habe vrstanden. Ich habe auch die packagename definieren. Deshalb ist es
        }

        return string;

    }

}
