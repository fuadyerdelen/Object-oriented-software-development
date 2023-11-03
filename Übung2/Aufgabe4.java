import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Nummer bitte ..");

		int num = scan.nextInt();

		if (num < 0) {
			System.out.println("Kein Negativ!!");

		} else if (num == 1) {
			System.out.println("1 Kein !!");

		}

		for (int i = 2; i <= num; i++) {

			for (; num >= 0; num--) {

				if (num % i != 0) {
					System.out.println(num);
				}

			}

		}

	}
}
