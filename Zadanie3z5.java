import java.util.Scanner;

public class Zadanie3z5 {

	public static int strpos(String text, char z) {

		int n = 0;
		n = text.indexOf(z);

		return n;
	}

	public static void main(String[] args) {

		String test;
		test = "Ala ma kota";
		char x;
		x = 'Z';

		System.out.println(strpos(test, x));
	}
}