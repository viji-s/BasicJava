package basics;

public class Animal {
	
	String s;
	int i;
	//String k;
	String Public;
	static int j;
	
	Animal(){
		
	}
	
	Animal(String s){
		this.s=s;
	}
	
//	Animal(int i,String k){
//		this.i=i;
//		this.k=k;
//		
//	}
	
	public void m1() {
		System.out.println("Normal method");
	}

	@Override
	public String toString() {
		return "Animal [ s=" + s +  "]";
	}

	
	public static void main(String[] args) {
		Add d=new Add();
		d.addTwo(10,20);
		Animal a=new Animal("horse");
		System.out.println(a);
		System.out.println(a.getClass().getName());
	}

}
