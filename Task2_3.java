package lab2;

public class Task2_3 {
	
//	This method takes 
//	as an input one integer value n and then output on 
//	console a Christmas tree in which last part height equals 
//	n. 
//	The tree consists of pyramids of heights from 1 to n. 
//	The shape have to be as presented below (for n=4): 
	//    X 
	//    X
	//   XXX
	//    X 
	//   XXX
	//  XXXXX 
	//    X
	//   XXX
	//  XXXXX
	// XXXXXXX
	public static void drawChristmasTree(int n) {
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < k+1; i++) {
	        	for (int j = 0; j < n - i; j++) {
					System.out.print(" ");
				}

				for (int j = 0; j < 2 * i + 1; j++) {
					System.out.print("X");
				}
				
				System.out.println();
				
			}
		}
        
	}
	
	public static void main(String[] args) {
		drawChristmasTree(4);
		System.out.println("====================");
		drawChristmasTree(7);
	}
}
