package basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionExa implements Comparator{

	public static void m1(Collection c) {
		System.out.println(c);
		Object[] o = c.toArray();
		//iterator for Object
		
		for (Object obj : o) {
			System.out.println(obj);

		}
		System.out.println("Print using Iterator interface");
		Iterator iter=c.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(c);
       	Collection cols = new ArrayList();
		cols.add(c);
		System.out.println(" collection to Array");
		Object[] array = cols.toArray();
		System.out.println("Print using Iterartor");
		Iterator itr=cols.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for (Object arr : array) {
			System.out.println(arr);
		}
		
		System.out.println(cols);
	}

	public static void m2(List<String> l,Collection c) {
		System.out.println(l);
		ListIterator<String> itr=l.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		System.out.println();
		l.addAll(4, c);
		System.out.println(l);
		System.out.println();
		Object[] ob=l.toArray();// when we use the Object class internally
		String[] str= l.toArray(new String[l.size()]);
		// <T> T[] toArray(T[] a);
		System.out.println("the size of an array" + str.length);
		System.out.println();
		for(Object obj:str) {
			System.out.println(obj);
		}
		
			
		}
	public static void m3(Collection<String> c) {
		
		List<String> itr=new ArrayList<String>(c);
		String[] s= itr.toArray(new String[itr.size()]);
		Iterator it=itr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	public static void main(String[] args) {

		Collection col = new ArrayList();
		col.add("viji");
		col.add("senthil");
		col.add("rajeshwari");
		col.add("hariharan");
		col.add("viji");
		List list1=new ArrayList(col);
		System.out.println("List prints" + list1);
		//col.add(5);
		System.out.println("After reverse" + list1 );
		//System.out.println(col);
		//CollectionExa.m1(col);

		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		//CollectionExa.m2(list ,col);
		CollectionExa.m3(col); 
		
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
