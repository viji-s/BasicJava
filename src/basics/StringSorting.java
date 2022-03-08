package basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StringSorting {
	
	
	public static void main(String[] args) {
		
		String[] strArray= {"ramya","viji","raji","senthil","hari"};
		Integer[] num={34,758,24,689,45};
		System.out.println(strArray.length);
		Arrays.sort(strArray,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				String s1=(String)o1;
				String s2=(String)o2;
				return s2.compareTo(s1);
			}
			
		});
		System.out.println(strArray);
		for(String arr:strArray ) {
			System.out.println(arr);
		}
		Arrays.sort(num ,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
			
			Integer i1=(Integer)o1;
			Integer i2=(Integer)o2;
			return i2.compareTo(i1);
			
			}
			
		});
		
		System.out.println(strArray);
		for(Integer arr:num ) {
			System.out.println(arr);
		}
		// Sorting the strings
//		strArray = Stream.of(strArray)
//		    .sorted()
//		    .toArray(String[]::new);
//		 
//		// Sorted array
//		System.out.println("Sorted : " + Arrays.toString(strArray));
//		 
		
//		Arrays.sort(s1);
//		
//		System.out.println();
//		
//		for(String s:s1)
//		System.out.println(s.toString());
	}

}
