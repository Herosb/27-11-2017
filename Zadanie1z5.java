import java.util.Scanner;

public class Zadanie1z5 {

	private static double silnia(double i) {
		if (i < 1)
			return 1;
		else
			return i * silnia(i - 1);
	}

	private static double silnia2(double i) {
		double wynik;
		wynik = 1;
		for (int j = 1; j < (i+1); j++) {
			wynik=wynik*j;
		}
		return wynik;
	}

	public static void main(String[] args) {
		int n;

		System.out.println("Podaj dla jakiej liczby obliczyc silnie.\n");

		Scanner odczyt = new Scanner(System.in);
		n = odczyt.nextInt();

		System.out.println(n + "! = " + silnia(n));
		System.out.println(n + "! = " + silnia2(n));
	}
}