package basics;

public class AnonymousTest{
	
	public  AnonymousTest m1() {
		System.out.println("parent m1 method");
		return new AnonymousTest();
	}

}
