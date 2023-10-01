package lab2;

import java.util.Arrays;

public class PascalTriangle {
	public static int[] generateNextRow(int[] prevRow) {
		int length = prevRow.length;
		int[] result = new int[length + 1];
		result[0] = 1;
		result[result.length - 1] = 1;
		for (int i = 1; i < result.length - 1; i++) {
			result[i] = prevRow[i] + prevRow[i - 1];
		}

		return result;
	}

	public static int[] getPascalTriangle(int n) {
		if (n == 1) {
			return new int[] { 1 };
		} else {
			int[] prevRow = getPascalTriangle(n - 1);
			return generateNextRow(prevRow);
		}

	}

	public static void printPascalTriangle(int row) {
		for (int i = 1; i <=row; i++) {
			System.out.println(Arrays.toString(getPascalTriangle(i)));
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 1 };
		int[] arr2 = { 1, 3, 3, 1 };
		System.out.println(Arrays.toString(generateNextRow(arr1)));
		System.out.println(Arrays.toString(generateNextRow(arr2)));
		
	    System.out.println("========");

		System.out.println(Arrays.toString(getPascalTriangle(3)));
		System.out.println(Arrays.toString(getPascalTriangle(4)));
		System.out.println(Arrays.toString(getPascalTriangle(1)));
		
		 System.out.println("========");
		 
		printPascalTriangle(4);
		printPascalTriangle(10);
	}

}
