/*
Find the Maximum Element and Average of Elements in an Array.
 */
package Assignment_28_09_24;

import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 7, 9 };
		Arrays.sort(arr);
		int secondMin = arr[1];
		int secondMax = arr[arr.length - 2];
		System.out.println("2nd Minimum=" + secondMin);
		System.out.println("2nd Maximum=" + secondMax);

	}

}
