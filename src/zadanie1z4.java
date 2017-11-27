import java.util.Scanner;

public class zadanie1z4 {

	public static void main(String[] args) {
		int n = 0;
		int liczba = 0;
		System.out.println("Podaj ciag znakow");
		String znaki;
		Scanner odczyt = new Scanner(System.in);
		znaki = odczyt.nextLine();
		// [typ] [nazwa]
		char ost = znaki.charAt(znaki.length() - 1);

		// char charAt(int 0-1);
		for (int i = 0; i < znaki.length(); i++) {
			if (znaki.charAt(i) == ost) {
				n++;
			}
		}

		System.out.println(n);

	}

}
