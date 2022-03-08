package basics;

import java.util.HashMap;
import java.util.Map;

public class FindDisctictValueFromAGivenString {

	public static void findDistinctValue(String txt) {
	char[] ch=txt.toCharArray();
	Map<Character,Integer> map=new HashMap<Character, Integer>();
	for(char c:ch) {
		if(map.containsKey(c)) {
		   map.put(c,map.get(c)+1);
		}else
		{
			System.out.println(map.get(c));
			map.put(c, 1);
		}
	}
	System.out.println(map);
		
	}
	 public static void main(String[] args) {
	 String text = "abcdABCDaabcd";
	 FindDisctictValueFromAGivenString.findDistinctValue(text);
	 }
}