package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumberInArray {

	public static void m1(int[] arr) {
		List list = new ArrayList();
		for (int i : arr) {
			list.add(i);
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
       System.out.println(Collections.max(list));

	}
	public static void m2(Integer[] arr) {
		List l=Arrays.asList(arr);
		Collections.sort(l);
		System.out.println(Collections.max(l));
	}

	public static void main(String[] args) {

		int[] array = new int[] { 3, 34, 5, 1, 23 };
		LargestNumberInArray.m1(array);

		
		Integer[] arr=new Integer[] {33,1,2,55,9,5,67,45};
		LargestNumberInArray.m2(arr);
		
	}

}
