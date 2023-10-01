package lab2;

public class Task1_4 {
	public static void moveTower(int n,char source,char dest,char spare) {
		if(n<1) {
			throw new IllegalArgumentException();
		}
		if(n==1) {
			System.out.println("Take disk 1 from tower "+source+" to tower "+dest);
		    return ;
		}
		
		moveTower(n-1, source, spare, dest);
		System.out.println("Take disk "+n+" from tower "+source+" to tower "+dest);
        moveTower(n-1, spare, dest, source);
	}

	public static void main(String[] args) {
	   moveTower(3, 'A', 'C', 'B');
	   System.out.println("=======");
	   moveTower(2,'A', 'C', 'B');
	}

}
