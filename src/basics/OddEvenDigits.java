package basics;

public class OddEvenDigits {

	public static void main(String[] args) {
    
    int n=52341;
     int even=0;
     int odd=0;
     while(n!=0) {
    	 
    	 int temp=n%10;
    	 if(temp%2==0) {
    		 even++;
    	 }else {
    		 odd++;
    	 }
    	 n=n/10;
     }
		
		System.out.println("No.of even Numbers" + even);
		System.out.println("No.of odd numbers" + odd);
		
	}

}
