package lab2;

public class Task2_1 {

//	This method takes as an input 
//	one integer value n and then output on console a pyramid 
//	as on figure below for example for n=4: 
	//    X
	//   XXX
	//  XXXXX
	// XXXXXXX

	public static void drawPyramid(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("X");
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		drawPyramid(10);
		System.out.println("======");
		drawPyramid(4);
	}
}
