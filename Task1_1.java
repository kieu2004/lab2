package lab2;

public class Task1_1 {
	// S(n)=1-2+3-4+…+ ((-1)^(n+1) ).n , n>0
	public static int getSn1(int n) {
		// Cách 1
		if (n == 1) {
			return 1;
		}
		return getSn1(n - 1) + (int) Math.pow(-1, n + 1) * n;
		
		// Cách 2
//        int total=0;
//        for (int i = 1; i <=n; i++) {
//			if(i%2==0) {
//				total+=(-i);
//			}else {
//				total+=i;
//			}
//		}
//		return total;

	}

	public static int giaiThua(int n) {
		if (n == 0) {
			return 1;
		}

		return n * giaiThua(n - 1);
	}

	// S(n)=1+1.2+1.2.3+…+1.2.3…n, n>0
	public static int getSn2(int n) {
		if (n == 1) {
			return 1;
		}

		return getSn2(n - 1) + giaiThua(n);
	}

	// S(n)=1^2+2^2+3^2+....+n^2 , n>0
	public static int getSn3(int n) {
		if (n == 1) {
			return 1;
		}
		return getSn3(n - 1) + (int) Math.pow(n, 2);
	}

	// S(n)=1+1/2+1/(2.4)+1/(2.4.6)+…+1/(2.4.6.2n), n>=0
	// cũng giống như giai thừa của các số chẵn thôi
	public static double giaiThuaChan(int n) {
		if (n == 0) {
			return 1;
		}
		return (2 * n) * giaiThuaChan(n - 1);
	}

	public static double getSn4(int n) {
		if (n == 0) {
			return 1;
		}
		return getSn4(n - 1) + 1 / giaiThuaChan(n);
	}

	public static void main(String[] args) {
		System.out.println(getSn1(5));
		System.out.println(getSn2(5));
		System.out.println(getSn3(5));
		System.out.println(getSn4(5));
	}
}
