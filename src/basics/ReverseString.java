package basics;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="I love Family";
		byte[] b=str.getBytes();
		byte result[]=new byte[b.length];
		for(int i=0;i<b.length;i++) {
			result[i]=b[b.length-i-1];
						
		}
		String st=new String(result);
		System.out.println(st);
	}
}
