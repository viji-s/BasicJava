package basics;

public class arrayBasics {

	public  void m1(Integer[] a) {
		
		try {
			finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a.length);
	}
	
	
	public static void main(String[] args) {
		
		arrayBasics obj=new arrayBasics();
		
		Integer[] arr=new Integer[100];
		obj.m1(arr);
		
	}
}
