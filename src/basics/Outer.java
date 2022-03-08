package basics;

public class Outer {

	int x = 10;
	static int y = 20;

	class Inner {

		int x=100;
		public void m1() {
			int x=1000;
			System.out.println(x); //1000
			System.out.println(this.x);//100
		    System.out.println(Inner.this.x);//this is same as this.x,prints same 100
			System.out.println(Outer.this.x);//10
			System.out.println(y);//20

		}
	}

	public static void main(String[] args) {
		new Outer().new Inner().m1();
	}
}
