package basics;

public class StringSwap {

	public static void main(String[] args) {
		String a = "viji";
		String b = "Senthil";
		// b = a;
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		System.out.println(b);
		a = a.substring(b.length());
		System.out.println(a);

	}

}
