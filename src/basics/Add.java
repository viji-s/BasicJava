package basics;

public final class Add {
//	Add obj;
//	private Add(Add obj) {
//		this.obj=obj;
//	}
//	public Add getObject() {
//		return obj;
//	}
	int x;
	int y;
	public void m1() {
		
		int x=100;
		int y=0;
		try {
		 System.out.println(x/y);
		 System.out.println("inside try");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
		System.out.println("finally block");
		}
	}
	public void m3() {
		
		int x=100;
		int y=0;
		try {
		 System.out.println(x/y);
		 System.out.println("inside try");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
		System.out.println("finally block");
		}
	}
	
	
	public void addTwo(int x, int y) {
	
		int c= x+y;
		System.out.println(c);
		System.out.println((double)100);
	}

//	public static void main(String[] args) {
//				Add obj=new Add();
//				obj.m1();
//		obj.addTwo(10, 20);
//		System.out.println(obj.x);
//		
//	}

}
