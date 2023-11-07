import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
// Hier nehme ich den gegebene Nummer ein
		
		Scanner scan = new Scanner(System.in);
		System.out.println("tippen sie ein Nummer bitte ..");
		int num = scan.nextInt();

// Ich definiere hier eine Bedingungen: keine Negative Zahl und keine 1.
		
		if (num < 0) {
			System.out.println("Die Nummer kann nicht negativ werden!");
		} else if (num == 1) {
			System.out.println("Bitte auser 1 !");
		}

// hier I'm stack !!
		
		for (int i = 2; i <= num; i++) {

			for (; num >= 0; num--) {

				if (num % i != 0) {
					System.out.println(num);
				}

			}

		}

	}
}
