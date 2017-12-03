import java.util.Scanner;

public class Zadanie2z4 {

	public static void main(String[] args) {
		int n;
		System.out.println("Podaj ciag znakow");
		String znaki;
		Scanner odczyt = new Scanner(System.in);
		znaki = odczyt.nextLine();
		for (int i = 0; i < znaki.length(); i++) {
			System.out.print(znaki.charAt(znaki.length() - 1 - i));
		}
	}
}