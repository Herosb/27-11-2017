public class Zadanie7z5 {

	public static int strfind(String gdzie, String co) {

		int poz=0;
		poz=gdzie.indexOf(co);
		
		
	  return poz;
	}

	public static void main(String[] args) {

		String test1,test2;
		test1 = "Ala ma kota";
		test2 = "jfgjgh";

		System.out.println(strfind(test1,test2));
	}
}