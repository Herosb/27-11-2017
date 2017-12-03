import java.util.Scanner;

public class Zadanie4z4 {

	public static void main(String[] args) {
		int n;
		System.out.println("Podaj ciag znakow");
		String znaki;
		int suma;
		suma = 0;
		Scanner odczyt = new Scanner(System.in);
		znaki = odczyt.nextLine();
		for (int i = 0; i < znaki.length(); i++) {

			switch (znaki.charAt(i)) {
			case '1':
				suma = suma + 1;
				break;
			case '2':
				suma = suma + 2;
				break;
			case '3':
				suma = suma + 3;
				break;
			case '4':
				suma = suma + 4;
				break;
			case '5':
				suma = suma + 5;
				break;
			case '6':
				suma = suma + 6;
				break;
			case '7':
				suma = suma + 7;
				break;
			case '8':
				suma = suma + 8;
				break;
			case '9':
				suma = suma + 9;
				break;
			}
		}

		System.out.print(suma);
	}
}