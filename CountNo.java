/*
 Count the number of occurrence of each element of an array.
 */

package Assignment_28_09_24;

public class CountNo {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
		int count = 0;
		int n = 6;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				count++;
			}
		}
		System.out.println(count);
	}

}
