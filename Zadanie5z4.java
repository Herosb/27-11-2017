import java.util.Scanner;

public class Zadanie5z4 {

	public static void main(String[] args) {
		int n;
		System.out.println("Podaj ciag znakow");
		String znaki;
		int suma1,suma2;
		suma1 = 0;
		suma2 = 0;
		Scanner odczyt = new Scanner(System.in);
		znaki = odczyt.nextLine();
		for (int i = 0; i < znaki.length(); i++) {

			switch (znaki.charAt(i)) {
			case '(':
				suma1 = suma1 + 1;
				break;
			case ')':
				suma2 = suma2 + 1;
				break;
		
			}
		}

		if (suma1 != suma2)
		{
			System.out.print("b³êdne sparowanie nawiasów");	
		}
		else
		{
			System.out.print("prawid³owe sparowanie nawiasów");	
		}	
		

	}
}