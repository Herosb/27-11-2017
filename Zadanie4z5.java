public class Zadanie4z5 {

	public static String flipcase(String text) {

		char[] chars = text.toCharArray();
	    for (int i = 0; i < chars.length; i++)
	    {
	        char c = chars[i];
	        if (Character.isUpperCase(c))
	        {
	            chars[i] = Character.toLowerCase(c);
	        }
	        else if (Character.isLowerCase(c))
	        {
	            chars[i] = Character.toUpperCase(c);
	        }
	    }
	    return new String(chars);
	}

	public static void main(String[] args) {

		String test;
		test = "Ala ma kota";
		
		System.out.println(flipcase(test));
	}
}