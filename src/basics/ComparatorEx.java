package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
	
	public static void main(String[] args) {
		List<Integer> l= new ArrayList<Integer>() ;
		l.add(33);
		l.add(21);
		l.add(79);
		Collections.sort(l,(i1,i2)->i1.compareTo(i2));
		System.out.println(l);
		List<Integer> l1= new ArrayList<Integer>() ;
		l1.add(33);
		l1.add(23);
		l1.add(73);
		l1.sort((i1,i2)->i2.compareTo(i1));
		System.out.println(l1);
		List l3=l1.subList(0, 1);
		System.out.println(l3);
		
	}

}
