package basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToListConversion {
	
	public static void main(String[] args) {
		
		Set<Integer> s=new HashSet<Integer>();
		s.add(1);
		s.add(3);
		s.add(1);
		s.add(5);
		s.add(1);
		System.out.println(s);
		System.out.println(s.hashCode());
		List<Integer> list=new ArrayList<Integer>(s);
		list.addAll(s);
		System.out.println(list.hashCode());
		System.out.println(list);
		
		
	}
			

}
