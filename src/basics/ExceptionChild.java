package basics;


public class ExceptionChild extends ExceptionParent  {
	

	public  void m1()  {
		System.out.println("Child class");
		
	}
	
	public static void main(String[] args){
		ExceptionParent p=new ExceptionChild();
		p.m1();
	
	}
}
