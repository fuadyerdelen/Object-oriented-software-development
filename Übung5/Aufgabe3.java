package Übung5;

public class Aufgabe3 {

    public static void main(String[] args) {
        String[] Stringarray = { "elf", "zwölf" };

        sort(Stringarray);
    }

    public static void sort(String[] strs) {

        String[] neueFeldString =new String[2];

        if (strs[0].compareTo(strs[1]) == 1) {
            neueFeldString[0] = strs[1];
        } else if (strs[0].compareTo(strs[1]) == -1) {
            neueFeldString[1] = strs[0];
        }

        for (int i = 0; i < neueFeldString.length; i++) {// ------> für Ausgabe von Array
            System.out.print(neueFeldString[i]);
            if (i < neueFeldString.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
