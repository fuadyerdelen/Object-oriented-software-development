package Übung5;

public class Aufgabe2 {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = " Hello ";

        // Aufgabe2.a
        System.out.println(s1 + ", " + s2 + ", " + s3);

        // Aufgabe2.b
        s3 = s3.trim();// -------> Das macht die Leerzeichen von s3 weg
        System.out.println(s1 + ", " + s2 + ", " + s3);

        // Aufgabe 2.c
        if (s1 == s2)
            System.out.println("s1 und s2 sind gleich");// --->true
        if (s1 == s3)
            System.out.println("s1 und s3 sind gleich");// --->false

        if (s1.equals(s2))
            System.out.println("s1 und s2 sind gleich");// --->true
        if (s1.equals(s3))
            System.out.println("s1 und s3 sind gleich");// --->true

        // Aufgabe 2.d
        String s4 = "";
        System.out.println("Stringtest: " + (s4 == ""));// ----> true

        String s5 = s1.substring(0);
        System.out.println("Stringtest: " + (s5 == ""));// ----> false

        // Aufgabe 2.e
        // Hier habe ich nur "false" bekommen, weil wir beim Bearbeiten von verschiedenen Datentypen Klammern verwenden müssen. 
        System.out.println("Stringtest: " + s4 == "");

        //Aufgabe2.f
        System.out.println(s1.substring(1,4));

    }
}
