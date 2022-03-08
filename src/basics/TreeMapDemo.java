package basics;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap t=new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
//				String s1=(String)o1;
//				String s2=(String)o2;
//				return s2.compareTo(s1);
				Integer i1=(Integer)o1;
				Integer i2=(Integer)o2;
				return i2.compareTo(i1);
			}
			
		});
		
		t.put(77,1);
		t.put(1,3);
		t.put(0,9);
		System.out.println(t);
		
	}
}
