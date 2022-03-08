package basics;

public interface TestInterface1 {
	
	default void show() {
		
		System.out.println("Defaut method in Test interface one");
	}

}
