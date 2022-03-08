package basics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;

public class ArraysToString  {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };

		System.out.println(Array.getLength(a));
		System.out.println(Arrays.stream(a));
		String date = "1/26/2022";
		String[] d = date.split("/");
		for(String dd:d) {
			System.out.println(dd);
		}

	}
}
