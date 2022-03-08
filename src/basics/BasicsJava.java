package basics;

public class BasicsJava {

	public static void main(String[] args) {
		int arr[][] = { { 10, 20, 30 }, { 40, 50 } };

		for (int[] x1 : arr) {
			for (int x2 : x1) {
				System.out.println(x2);
			}
		}
	}
}
