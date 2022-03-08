package basics;

public class IntClas implements I1, I2 {

	public static void main(String[] args) {
		//IntClas.m1(new IntClas());
		IntClas obj=new IntClas();
	    obj.m1();
	    I1.m3();
	    

	}

	@Override
	public void m1() {
		I1.super.m2();
		
	}
}
