package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectonEx {

	public static void m1(int[] arr, int key) {
		List l = new ArrayList();
		for (int ar : arr) {
			l.add(ar);
		}
		Collections.sort(l);
		System.out.println(l);
		int x = Collections.binarySearch(l, key);
		Collections.reverse(l);
		System.out.println(x);
		ArrayList<ChildClass> al = new ArrayList<ChildClass>();
		// obj.add(new Animal());
		// al.add(new ChildClass(10));


	}

	public static void main(String[] args) {

		int[] arr = new int[] { 30, 50, 10, 20, 500 };
		int key = 920000;
		CollectonEx.m1(arr, key);

	}

}
