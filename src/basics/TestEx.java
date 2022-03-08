package basics;

public class TestEx {

	public static TestEx m1() {
		System.out.println("Inside static method");
		return new TestEx();

	}
	
	public static void main(String[] args) {
		TestEx t=TestEx.m1();
	}
}
