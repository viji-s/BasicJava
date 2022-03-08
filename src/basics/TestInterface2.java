package basics;

public interface TestInterface2 {
	
	default void show() {
		System.out.println("Default method in Test interface 2");
	}
}