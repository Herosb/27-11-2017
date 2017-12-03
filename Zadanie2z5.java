import java.util.Scanner;

public class Zadanie2z5 {

	private static int fibo(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibo(n - 1) + fibo(n - 2);
	}

	private static int fibo2(int i) {

		int wynik, k1, k2, k3;
		if (i == 0)
			return 0;
		else if (i == 1)
			return 1;

		k1 = 0;
		k2 = 1;
		k3 = 1;

		for (int j = 1; j < i; j++) {
			k3 = k1 + k2;
			k1 = k2;
			k2 = k3;
		}

		return k3;
	}

	public static void main(String[] args) {
		int n;

		System.out.println("Podaj liczbe.\n");

		Scanner odczyt = new Scanner(System.in);
		n = odczyt.nextInt();

		System.out.println(n + "fibo = " + fibo(n));
		System.out.println(n + "fibo = " + fibo2(n));
	}
}