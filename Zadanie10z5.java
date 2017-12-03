public class Zadanie10z5 {

	public static int strFindAndCount(String gdzie, String co) {

		int lastIndex = 0;
		int count = 0;

		while(lastIndex != -1){

		    lastIndex = gdzie.indexOf(co,lastIndex);

		    if(lastIndex != -1){
		        count ++;
		        lastIndex += co.length();
		    }
		}

		
		
		
	  return count;
	}

	public static void main(String[] args) {

		String test1,test2;
		test1 = "Ala ma kota ma mas fdsdf";
		test2 = "mjhnfgja";

		System.out.println(strFindAndCount(test1,test2));
	}
}