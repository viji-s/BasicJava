package basics;

public class TestInterface implements TestInterface1,TestInterface2{

	public static void main(String[] args) {
		//TestInterface t=new TestInterface();
		TestInterface1 t=new TestInterface();
		//t.show();
		t.show();
	}

	@Override
	public void show() {
		
		TestInterface1.super.show();
		//TestInterface2.super.show();
		
	}

}
