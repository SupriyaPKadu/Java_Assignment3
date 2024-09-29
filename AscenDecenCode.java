package Assignment_28_09_24;

import java.util.Arrays;

public class AscenDecen {

	public static void main(String[] args) {

		int[] arr = { 1, 90, 34, 89, 7, 9 };

		int n = arr.length;
		int mid = n / 2;

		Arrays.sort(arr);

		for (int i = mid; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Output: " + Arrays.toString(arr));
	}
}
