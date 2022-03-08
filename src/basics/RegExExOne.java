package basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExOne {

	public static void main(String[] args) {
		int count=0;
		/*//Pattern p =Pattern.compile("ba");
		Pattern p =Pattern.compile("[abc]"); //search for either a or b or c
		//Pattern p =Pattern.compile("[^abc]"); //search for string excpt a or b or c
		Pattern p =Pattern.compile("[a-z]"); 
		//search for any lower case aphabet symbol from a-z
		Pattern p =Pattern.compile("[A-Z]"); 
		//search for any Upper case aphabet symbol from a-z
		Pattern p =Pattern.compile("[a-zA-Z]"); 
		//search for any aphabet symbol from a-z or A-Z 
		Pattern p =Pattern.compile("[0-9]"); 
		//search for any digit
		Pattern p =Pattern.compile("[A-Za-z0-9]"); 
		//search for any alpha numeric
		Pattern p =Pattern.compile("[^A-Za-z0-9]");
		//search for any symbol without any alpha numeric symbol*/
		//Pattern p=Pattern.compile("ab");
		Pattern p1=Pattern.compile("\\s");
		String[] s=p1.split("Durga soft solutions");
		for(String s1:s) {
			System.out.println(s1);
		}
		Matcher m=Pattern.compile("ab").matcher("abajhbaljba");
		while(m.find()) {
			System.out.println(m.start());
			System.out.println();
			System.out.println(m.end());
			System.out.println();
			System.out.println(m.group());
			count++;

		}
		System.out.println("Total occurances is " + count);
		
	}
}
