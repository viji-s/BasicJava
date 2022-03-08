package basics;

public class Sorting {

	public static void main(String[] args) {
	String n="1234";
	int i=Integer.parseInt(n);
	System.out.println(i);
	String temp="";
	while(i!=0) {
		int temp1=i%10;
		temp=temp+temp1;
		i=i/10;
	}
	System.out.println(temp);
	}
}
