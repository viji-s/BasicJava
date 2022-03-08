package basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class CollectionEx {
	
	public  static void main(String[] args) {
	 Vector<Integer> v=new Vector<Integer>();
	 for(int i=0;i<=10;i++) {
		 v.add(i);
	 }
	 
	 Enumeration<Integer> e=v.elements();
	 while(e.hasMoreElements()) {
		Integer i= e.nextElement();
		 System.out.println(i);
		 
	 }
	 List<Integer> l=new ArrayList<Integer>();
	 l.add(1);
	 l.add(3);
	 l.add(5);
	 Iterator<Integer> itr=l.iterator();
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
	 
	 List<Integer> l3=new ArrayList<Integer>();
	 l3.add(1);
	 l3.add(3);
	 l3.add(5);
	 ListIterator its= l3.listIterator();
	 its.hasPrevious();
	 System.out.println(its.previous());
	 
	 Map<Integer ,String> map=new HashMap<Integer ,String>();
	 map.put(1, "viji");
	 map.put(2, "ramya");
	 
	 Set<Integer> s=map.keySet();
	 System.out.println(s);
	 
	 Collection<String> c=map.values();
    System.out.println(c);	 
    
    Set s1=map.entrySet();
    System.out.println(s1);
    
    Iterator itr3=s1.iterator();
    while(itr3.hasNext()) {
    	
    	
    	
    		Map.Entry<Integer,String> s5=(Map.Entry<Integer, String>)itr3.next();
    		System.out.println();
    		System.out.println(s5);
    		System.out.println(s5.getKey().equals(1));
    		if(s5.getKey().equals(1)) {
    			s5.setValue("senthilkumar");
    			
    		}
    	    System.out.println(map);

    		  	
    	   }
    
    
    
    
	}
}
