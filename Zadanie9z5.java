public class Zadanie9z5 {

	public static String[] podzielNaSlowa(String text) {

		int slowa = 0;
		int litery = 0;

		char[] chars = text.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];

			if (Character.isWhitespace(c)) {
				if (litery > 0) {
					slowa++;
					litery = 0;
				}
			} else {
				litery++;
			}

		}
		if (litery > 0) {
			slowa++;
		}

		String[] tablica = new String[slowa];
		for (int i = 0; i < tablica.length; i++) {
			tablica[i] = "";
		}

		slowa = 0;
		litery = 0;

		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];

			if (Character.isWhitespace(c)) {
				if (litery > 0) {
					slowa++;
					litery = 0;
				}
			} else {
				litery++;
				tablica[slowa] = tablica[slowa] + c;
			}

		}
		if (litery > 0) {
			slowa++;
		}

		return tablica;
	}

	public static void main(String[] args) {

		String test;
		test = "Ala ma kota i psa ";

		String[] tablica = podzielNaSlowa(test);
		for (int i = 0; i < tablica.length; i++) {
			System.out.println(tablica[i]);
		}
	}
}