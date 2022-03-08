package basics;



public class Parent {
	int j;
	double k;
	
	Parent() {

	}

	Parent(int j) {
		this.j=j;
		System.out.println("Parent class constructor" + j);
	}

	Parent(double j) {
		this.k=j;
		System.out.println("Parent class constructor" + j);
	}

	Parent(String j) {
		System.out.println("Parent class constructor" + j);
	}

	public static Parent m1(Parent str) {

		System.out.println("Parent class m1 method");
		str.m3();
		return str;
	}
	
	public void m2() {
		System.out.println("Parent class method m2");
	}

	public void m3() {
        
		System.out.println("Parent class m3 method");
	}
//	public static void main(String[] args) {
//		
//	 Parent p=Parent.m1(new Parent());
//	 p.m3();
//	 
//	}
}
