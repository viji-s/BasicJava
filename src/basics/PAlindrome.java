package basics;

public class PAlindrome {
	
	public static void main(String[] args) {
		
		
		int n=121;
		int temp=0;
		int sum=0;
		while(n!=0) {
			temp=n%10;
			System.out.println(temp);
			sum=(sum*10)+temp;
			System.out.println(sum);
			n=n/10;
			
		}
		System.out.println(sum);
	}

}
