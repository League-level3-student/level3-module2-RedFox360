package _04_JavaClassSearchAndSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Use the Arrays and Collections classes to implement the search and sort
 * methods below.
 */
public class _02_JavaClassSearchSort {

	public static int[] arraySort(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}

	public static List<Double> listSort(List<Double> list) {
		Collections.sort(list);
		return list;
	}

	public static Boolean arraySearch(char[] arr, char key) {
		Character[] c = new Character[arr.length];
		for (int i = 0; i < arr.length; i++) {
			c[i] = arr[i];
		}
		List<Character> chars = Arrays.asList(c);
		return chars.contains(key);
	}

	public static Boolean listSearch(List<Character> list, Character key) {
		return list.contains(key);
	}
}
