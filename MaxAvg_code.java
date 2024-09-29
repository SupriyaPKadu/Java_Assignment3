/*
 Find the Maximum Element and Average of Elements in an Array.
 */

package Assignment_28_09_24;

public class MaxAvg {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		double avg = sum / a.length;
		System.out.println("Maximum Value: " + max);
		System.out.println("Average: " + avg);
	}

}
