package basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Recursion {

	public static int m1(int[] arr, int first, int last, int key) {
		 if (last>=first){  
	            
		int mid = (first + last) / 2;
		/*
		 * Arrays.sort(arr); int x = Array.getInt(arr, 2); System.out.println(x);
		 */
		
		if(arr[mid]==key) {
			return mid;
		}
		if (arr[mid] > key) {
			return m1(arr, first, mid - 1, key);

		}
		else {
			return m1(arr,  mid +1,last, key);
		}
		 }
			return -1;

	}
	public static int m2( int[] arr,int key) {
		
		return Arrays.binarySearch(arr, key);
		
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 20,30,40,50};
		int last = arr.length - 1;
		int first = 0;
		int key = 50;
		int result=Recursion.m1(arr, first, last, key);
		System.out.println(result+ " "+arr[result]);
		int result1=Recursion.m2(arr, key);
		System.out.println(result1+ " "+arr[result1]);

	}

}
