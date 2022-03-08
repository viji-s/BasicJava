package basics;

public class ChainedConstructor {
	ChainedConstructor(){
		this(10);
		System.out.println(" No arg constructor");
	}
	
	ChainedConstructor(int i){
		this("viji",37.3);
		System.out.println("Single constructor");
	}
	ChainedConstructor(String s,double d){
		System.out.println(s + d);
		System.out.println("double constructor");
	}
	public static void main(String[] args) {
		ChainedConstructor c=new ChainedConstructor();
		
	}
	
	

}
