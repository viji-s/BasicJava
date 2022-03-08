package basics;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class ReverseStrin {

	public static void m1() {
		
		
	}
	
	public static void main(String[] args) {
		
		String s1="Viji Senthilkumar26068438$%^";
		
		byte[] b=s1.getBytes();
		System.out.println(b);
		byte[] rev=new byte[b.length];
		System.out.println(rev.length);
		for(int i=0; i<=b.length-1;i++) {
		 rev[i]=b[(b.length-1-i)];
		 
		}
		String s=new String(rev);
		System.out.println(s);
		
		System.out.println("----------------------------------");
		String str= "Geeks", nstr="";
        char ch;
       
        
       //reverse 
      System.out.print("Original word: ");
      System.out.println("Geeks"); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
 
	
     //count the no. of lower case and upper case
      
      String upper=" ";
      int upperCount=0;
      String lower=" ";
      int lowerCount=0;
      int specialCount=0;
      String special=" ";
      int numberCount=0;
      String number=" ";
      char[] ch1=s1.toCharArray();
      for(int i =0;i<ch1.length;i++) {
    	  if(ch1[i]>='a' && ch1[i]<='z') {
    		  lower=lower+ch1[i];
    		  lowerCount=lowerCount+1;
    	  }
    	  else if(ch1[i]>='A' && ch1[i]<='Z') {
    			  upper=upper+ch1[i];
    			  upperCount=upperCount+1;
    		  }
    	  else if(ch1[i]>='0' && ch1[i]<='9') {
    		  number=number+ ch1[i];
    		  numberCount=numberCount+1;
    	  }
    	  else
    	  {
    		special=special+ch1[i];
    		specialCount=specialCount+1;
    	  
      }
    	  
      }
    	System.out.println(lower + "     "+upper);
    	System.out.println(lowerCount+ "    lowerCount"+"----------"+  upperCount + "  upeerCount");
    	System.out.println(numberCount+ "    numberCount"+"---------	 "+ specialCount + "  specialCount");
    	
    	HashMap map1=new HashMap(10);
    	HashMap map2=new HashMap(10);
    	System.out.println(map1.equals(map2));
    	System.out.println(map1==map2);

    	IdentityHashMap map3=new IdentityHashMap(10);
    	IdentityHashMap map4	=new IdentityHashMap(10);
    	System.out.println(map3.equals(map4));
    	System.out.println(map3==map4);

	}
}
