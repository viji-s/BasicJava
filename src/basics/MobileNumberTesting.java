package basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberTesting {

	public static void CheckUtils(String[] number) {
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			throw new Error("dfgjdhf");
		
		}
				for (String numb:number) {
		//System.out.println(number);
		Pattern p=Pattern.compile("(91|0)?[7-9][0-9]{9}");
		Matcher match=p.matcher(numb);
		if(match.find()) {
			
			System.out.println("number is valid " + numb + "  "+ match);
		}
		else {
		System.out.println("number is invalid"+numb);
	}
   	}
   	
	}

	public static void main(String[] args) {
		MobileNumberTesting.CheckUtils(new String[] { "01234567899", "+917823456789" });
	}
}
