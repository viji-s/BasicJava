package basics;

public class AnonymousTestChild extends AnonymousTest {

	public static void main(String[] args) {

		AnonymousTest test = new AnonymousTest() {
			public AnonymousTest m1() {
				System.out.println("Child m1() method");
				return new AnonymousTest();
			}
		};
		test.m1();
	}
}
