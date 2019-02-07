package session02;

import java.util.Arrays;

public class ArrayThings {
	public static void main(String[] args) {
		/*
		 * int []arr; // declration of an array. not initialized = null... it points to
		 * a heap mmory location of zero meaning null.
		 * 
		 * arr = new int[5]; // initializing array with 5 spaces with variable arr.
		 */
		int[] arr = new int[5];

		arr[2] = 7; // we give the value of 7 to the box with number 2... 0 , 1 , 2 [7], 3...

		// arr = null; // cut off initiallizing, results null

		System.out.println(arr.length); // shows array length
		System.out.println(arr[0]);

		int n = arr[1];
		System.out.println(n);

		System.out.println(Arrays.toString(arr));

		int[] arr2 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr2));

		int[][] matrix = { { 1, 2, 3 }, //
				{ 4, 5, 6 }, //
				{ 7, 8, 9 },//
		};
		System.out.println(matrix[0][0]);
		System.out.println(matrix[1][0]);
		System.out.println(matrix[0][1]);
		System.out.println(matrix[1][2]);
		System.out.println(matrix[2][2]);
// HWk: study the method of copying arrays.
	}

}
