/*
 Java program for rotation of elements of array- left and right.
 An array is said to be right rotated if all the selected 
 elements were moved towards right by one position.
 */

package Assignment_28_09_24;

import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length;

		System.out.println("Original Array: " + Arrays.toString(arr));

		int lastElement = arr[n - 1];
		for (int i = n - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = lastElement;
		System.out.println("After Right Rotation: " + Arrays.toString(arr));

		int firstElement = arr[0];
		for (int i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[n - 1] = firstElement;
		System.out.println("After Left Rotation: " + Arrays.toString(arr));
	}
}
