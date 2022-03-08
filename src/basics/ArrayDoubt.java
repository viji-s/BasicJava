package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDoubt {

	
	public static final void main(String[] args) {
		
		
		int[] a=new int[] {11,43,21,67};
		System.out.println(a);
		List list=Arrays.asList(a);
//		list.add(32);
//		list.remove(3);
		//list.set(0, 32);
		System.out.println(a);
		System.out.println(list);
		List l=new ArrayList();
		l.add(2);
		l.add(33);
		l.add(71);
		System.out.println(l);
	    //int[] a1=new int[5];
		Object[] a11=l.toArray();
		Object o=l.toArray(new Object[3]);
		System.out.println(o);
		
	}
}
