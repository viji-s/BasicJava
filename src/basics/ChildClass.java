package basics;

import java.lang.reflect.Method;

public class ChildClass extends Parent {

	private final String name = null;

	int a;
	int b;
	int c;
	
	
	public static void methodCount()  {

		int count = 0;
		Class<?> c = null;
		try {
			c = Class.forName("basics.ChildClass");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Method[] m = c.getDeclaredMethods();
		for (Method m1 : m) {

			System.out.println(m1);
			count++;
		}

	}
	
	ChildClass(){
		
	}

	ChildClass(int i) {
		// super(100);
		System.out.println("child class constructor" + i);
	}

	ChildClass(char i) {
		// super("viji");
		System.out.println("child class constructor" + i);
	}

	public void m2() {
		System.out.println("Child class method m2");
	}

	public void m1() {
		System.out.println(" Parent class overridden method");
	}

	public static void main(String[] args)  {
		ChildClass.methodCount();
		Parent p=new ChildClass();
	   System.out.println("the answer is ");
	   
	   p.m2();
		//p.m1();
		p.m3();
		System.out.println();
		ChildClass obj=new ChildClass();
		
		Parent p1=(Parent)obj;
		System.out.println(p1==obj);
		p1.m2();
		p.m3();
		System.out.println();
		
		Parent p3=new Parent();
		ChildClass c=(ChildClass)p3;
		//System.out.println(c==p3);
		c.m2();
		
		// ChildClass obj = new ChildClass(10);
		// obj.m1();
		// ChildClass obj1 = new ChildClass(10);
		// obj1.m1();
		// ChildClass obj2 = new ChildClass(10);
		// obj2.m1();
		// Parent obj3 = new ChildClass(10);
		// obj3.m1();

		// Parent obj1 = new ChildClass('v');
	}

}
