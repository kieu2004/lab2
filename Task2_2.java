package lab2;

public class Task2_2 {
	public static void pattern_1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i + 1; j++) {
				System.out.print((i + 1) + " ");
			}

			System.out.println();
		}
	}

	public static void pattern_2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i + 1; j++) {
				System.out.print((j + 1) + " ");
			}

			System.out.println();
		}
	}

	public static void pattern_3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void pattern_4(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2*n-2*i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i+1 ; j++) {
				System.out.print((j + 1) + " ");
			}

			int j;
			for (j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void pattern_5(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2*n-2*i; j++) {
				System.out.print(" ");
			}

			for (int j = n-i+1; j<=n; j++) {
				System.out.print((j-1) + " ");
			}

			for (int j = n; j >=n-i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void pattern_6(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

	public static void pattern_7(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < n - i; j++) {
				System.out.print((n - i) + " ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern_1(9);
		pattern_2(9);
		pattern_3(9);
		pattern_4(9);
		 pattern_5(9);
		pattern_6(9);
		pattern_7(9);
	}
}
