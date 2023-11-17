
package Übung4;

public class Aufgabe1 {

	public static void main(String[] args) {
		float[] deneme = { 15.5f, 13.2f, 16.8f, 4.6f, 7.9f, 89.5f };

		// Aufgabe 1.c
		float[] deneme2 = new float[0]; // hier bekomme ich "NaN", weil "zahlen.length" null ist

		System.out.println(durchschintt(deneme));
	}

	// Aufgabe 1.a
	static float durchschintt(float[] zahlen) {

		float summ = 0f;

		for (int i = 0; i < zahlen.length; i++) { // -----> bis Zahl von Array-Elemente
			summ += zahlen[i]; // ----> Ich sammle hier die gesamte Array-Elemente
		}

		return summ / zahlen.length; // gesamte Resultät durch Zahahlen von Array-Elemente

	}

}
