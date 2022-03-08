package basics;

public class CopyConstructor {
	
	int x=10;
	int y=20;
	CopyConstructor(){
		
	}
	CopyConstructor(CopyConstructor c){
		x=c.x;
		y=c.y;
		System.out.println(x + " "+y);
		System.out.println();
	}
	
	public void m1() {
		System.out.println("Inside method");
	}
	public static void main(String[] args) {
		
		CopyConstructor c=new CopyConstructor();
		System.out.println(c.x +"  "+c.y);
		System.out.println();
		c.x=30;
		c.y=40;
		c.m1();
		System.out.println(c.x+" " +c.y);
		System.out.println();
		CopyConstructor c1=new CopyConstructor();
		System.out.println(c1.x+"  " +c1.y);
		System.out.println();
		CopyConstructor c2=new CopyConstructor(c);
		System.out.println(c2.x+" "+c2.y);
		c2.hashCode();

	}

}
