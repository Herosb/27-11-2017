public class Zadanie8z5 {

	public static int wordCount(String text) {

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
		return slowa;
	}

	public static void main(String[] args) {

		String test;
		test = "Ala  3   ma kota                     ";

		System.out.println(wordCount(test));
	}
}