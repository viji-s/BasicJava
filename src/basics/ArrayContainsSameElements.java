package basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayContainsSameElements {
	public static boolean checkArrayContainsSameElements(Object[] arr1, Object[] arr2) {
		System.out.println(Arrays.asList(arr1));
		System.out.println(Arrays.asList(arr2));
		Set<Object> firstSetOfElements = new HashSet<>(Arrays.asList(arr1));
		Set<Object> secondSetOfElements = new HashSet<>(Arrays.asList(arr1));

		if (firstSetOfElements.size() != secondSetOfElements.size()) {
			return false;
		}

		return true;

	}

	public static void main(String[] args) {
		Integer[] a1 = { 1, 2, 3, 2, 1 };
		Integer[] a2 = { 1, 2, 3 };

		System.out.println(checkArrayContainsSameElements(a1, a2));
	}
}
