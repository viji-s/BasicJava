package basics;

public interface I1 {

	public void m1();
	
	public default void m2() {
		System.out.println("I1 interface");
	}
			
	public static void m3() {
		System.out.println("I1 interface");
	}
}
