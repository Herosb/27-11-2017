import java.util.Scanner;

public class Zadanie6z4 {

	public static void main(String[] args) {
		int n, przesuniecie;
		System.out.println("Podaj ciag znakow");
		String znaki, znaki2;
		znaki2="";
		Scanner odczyt = new Scanner(System.in);
		znaki = odczyt.nextLine();
		System.out.println("Podaj przesuniecie ");
		przesuniecie = odczyt.nextInt();
		for (int i = 0; i < znaki.length(); i++) {

			
			char c = (char)(znaki.charAt(i) + przesuniecie);
	        if (c > 'z')
	            znaki2 += (char)(znaki.charAt(i) - (26-przesuniecie));
	   
	        else if (c < 'a')
	            znaki2 += (char)(znaki.charAt(i) + (26+przesuniecie));
	        else
	            znaki2 += (char)(znaki.charAt(i) + przesuniecie);
		}
		
		System.out.println(znaki2);
	}

}
