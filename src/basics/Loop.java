package basics;

public class Loop {

	public static void main(String[] args) {
		int j=12349;
		int count=0;
		while(j!=0) {
			 int temp=j%10;
			System.out.println(temp);
			count++;
			j=j/10;
     System.out.println("j value is" + j);
		}
		System.out.println(" Total number" +count);
				}
}
