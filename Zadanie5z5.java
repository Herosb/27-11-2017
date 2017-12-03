public class Zadanie5z5 {

	public static boolean startsWith(String str1, String str2) {

		if (str1.indexOf(str2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		String test1,test2;
		test1 = "Ala ma kota";
		test2 = "aAla";

		System.out.println(startsWith(test1,test2));
	}
}