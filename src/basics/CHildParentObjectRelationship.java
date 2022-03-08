package basics;

import java.lang.reflect.Method;

public class CHildParentObjectRelationship {
	 
	 
	 CHildParentObjectRelationship(){
		 System.out.println(this.hashCode());
	 }
	 
	 public  static int  methodCount() throws ClassNotFoundException {
			
			int count =0;
			Class c=Class.forName("basics.CHildParentObjectRelationship");
			Method[] m=c.getDeclaredMethods();
			for(Method m1:m) {
				
				System.out.println(m1);
				count++;
			}
			return count;
			
		}

 }
 

 class child extends CHildParentObjectRelationship{
	 
	 child(){
		 System.out.println(this.hashCode());
	 }
 }
 
 class ChildParent{
	public static void main(String[] args) throws ClassNotFoundException {

		//child obj=new child();
		//System.out.println(obj.hashCode());
		CHildParentObjectRelationship obj=new child();
		System.out.println(CHildParentObjectRelationship.methodCount());
		
	}

}
