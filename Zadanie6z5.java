public class Zadanie6z5 {

	public static int strToInt(String str) {
		int i = 0;
		int j = 0;
		int num = 0;
		int ilecyfr = 0;
		int wykladnik = 1;
		boolean isNeg = false;
		boolean isNaukowa = false;

		if (str == "")
			return 0;

		if (str.charAt(0) == '-') {
			isNeg = true;
			i = 1;
		} else if (str.charAt(0) == '+') {
			isNeg = false;
			i = 1;
		}

		if (str.charAt(i) > '9' || str.charAt(i) < '0')
			return 0;

		j = i;
		while (j < str.length()) {
			if (str.charAt(j) > '9' || str.charAt(j) < '0') {
				if (str.charAt(j) == 'e') {
					if (str.charAt(j + 1) > '9' || str.charAt(j + 1) < '0') {
						isNaukowa = false;
					} else {
						isNaukowa = true;
						wykladnik = str.charAt(j+1) - '0';
					}
				}
				break;
			}
			ilecyfr++;
			j++;
		}

		while (i < ilecyfr) {
			num *= 10;
			num += str.charAt(i++) - '0';
		}

		if (isNaukowa)
		{
			double num2 = num;
			Double potega = Math.pow(num2, wykladnik);
			num = Integer.valueOf(potega.intValue());
		}
		
		if (isNeg)
			num = -num;
		return num;
	}

	public static void main(String[] args) {

		String test1;
		test1 = "2e9";

		System.out.println(strToInt(test1));
	}
}