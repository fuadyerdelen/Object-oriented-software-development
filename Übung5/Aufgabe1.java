package Übung5;

public class Aufgabe1 {

    public static void main(double[] args) {

        if (args.length < 2 || args == null) {
            throw new IllegalArgumentException("Sie müssen mindestens ein Kommandozeilenparameter übergeben!");
        }

        double result = 0.0;

        for (int i = 0; i < args.length; i++) {
            result += args[i];
        }
        System.out.println(result / args.length);
    }
}