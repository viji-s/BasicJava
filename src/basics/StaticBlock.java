package basics;

public class StaticBlock {
	
	static StaticBlock s=new StaticBlock();
	
	{
		System.out.println("hi");
		System.exit(0);
	}
	

}
