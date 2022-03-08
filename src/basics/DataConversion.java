package basics;

public class DataConversion {

	
	public static void main(String[] args) {
		 String a = "Hello";
	        String b = "World magic";
	          
	        // Print String before swapping
	        System.out.println("Strings before swap: a = " + 
	                                       a + " and b = "+b);
	          
	        // append 2nd string to 1st
	        a = a + b;
	          
	        // store initial string a in string b
	        System.out.println(a.length());
	        System.out.println(b.length());
	        b = a.substring(0,a.length()-b.length());
	          
	        // store initial string b in string a
	        a = a.substring(b.length());
	          
	        // print String after swapping
	        System.out.println("Strings after swap: a = " + 
	                                     a + " and b = " + b);  
	}
}
