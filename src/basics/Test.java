package basics;

public class Test {
	
		int i=10;
		//First instance block
		{
		m1();
		System.out.println("First instance blovk");
		}
		Test(){
			System.out.println("Constructor method");
		}
		public static void main(String[] args){
			Test t=new Test();
			System.out.println("main");
		}
		public void m1(){
			System.out.println(j);
		}
		//Second Instance block
		{
			System.out.println("Second instance block");
		}
		int j=20;


}
