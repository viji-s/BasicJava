	package basics;

import java.util.HashMap;
import java.util.Map;


public class HashMapEx {
	public void testHashMap()
	{
	Object[] data = new Object[1];
	
	Map<Object, Object> datamap = new HashMap<Object, Object>();
	for (int rows = 0; rows < 10; rows++) {
	
		datamap.put(rows, "viji");
	
	}
	data[0] = datamap;
	System.out.println(" data: " + data[0]);
	}
	
	public static void main(String[] args) {
		
		HashMapEx obj=new HashMapEx();
		obj.testHashMap();
	}

}
