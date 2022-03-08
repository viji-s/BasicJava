package basics;

import basics.Animal;
public class Home {
	Animal a;
	String tv;
	int vessels;
	

	
	@Override
	public String toString() {
		return "Home [a=" + a + ", tv=" + tv + ", vessels=" + vessels + "]";
	}



	Home(Animal a,String tv,int vessels){
		this.a=a;
		this.tv=tv;
		this.vessels=vessels;
		//System.out.println(a);
		
		//System.out.println("Animal constructor is" + a );
	}
	
	
	
//	

	public static void main(String[] args) {
		//Animal a=new Dog();
		//System.out.println(a.hashCode());
		//System.out.println(new Dog().hashCode());
		//Home h=new Home(new Animal(10,"viji"),"samsung",9);
		//System.out.println(h);
	}

}
