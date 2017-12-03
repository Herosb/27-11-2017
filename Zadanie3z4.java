import java.util.Scanner;

public class Zadanie3z4 {

	public static void main(String[] args) {
		int n;
		System.out.println("Podaj ciag znakow");
		String znaki, znaki2;
		znaki2="";
		Scanner odczyt = new Scanner(System.in);
		znaki = odczyt.nextLine();
		for (int i = 0; i < znaki.length(); i++) {
			
			znaki2=znaki2+znaki.charAt(znaki.length() - 1 - i);
		}

		if (znaki.compareTo(znaki2) == 0)
		{
			System.out.print(znaki + " jest palindromem");
		}
		else
		{
			System.out.print(znaki + " nie jest palindromem");
		}	
	}
}