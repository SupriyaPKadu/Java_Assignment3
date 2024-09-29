/*
  Java program to count numbers of even and odd elements in an array

 */

package Assignment_28_09_24;

public class CountEvenOdd {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int EvenCount = 0;
		int OddCount = 0;

		for (int i = 0; i < 9; i++) {
			if (arr[i] % 2 == 0)
				EvenCount++;
			else
				OddCount++;
		}
		System.out.println("Number Of Even Count: " + EvenCount);
		System.out.println("Number Of Odd Count:" + OddCount);
	}

}
