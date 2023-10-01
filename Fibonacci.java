package lab2;

public class Fibonacci {

	// get the nth value of the Fibonacci series
	public static int getFibonacci(int n) {
		if (n == 1) {
			return 0;
		}

		if (n == 2) {
			return 1;
		}

		return getFibonacci(n - 2) + getFibonacci(n - 1);

	}

	// This method is used to display a Fibonaccci series based on
	// the parameter n. Ex. n=10 ==> 0 1 1 2 3 5 8 13 21 34
	public static void printFibonacci(int n) {
		if(n<=0) {
		   throw new IllegalArgumentException();
		}else {
		   for (int i = 1; i <= n; i++) {
			System.out.print(getFibonacci(i)+" ");
		}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(getFibonacci(3));
		System.out.println(getFibonacci(10));
		System.out.println(getFibonacci(1));
		
		printFibonacci(10);
		System.out.println();
		printFibonacci(15);
	}
}
