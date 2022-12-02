import java.util.Scanner;
public class Invertid {
	public static void main(String[] algs) {
		Scanner in = new Scanner (System.in);
		int a[], b[], i; 
		a = new int[10];
		b = new int[10];
		
		System.out.print("A: ");
		for (i = 0; i <= 9; i++) {
			a[i] = in.nextInt();
			
		}
		System.out.println();
		System.out.print("B: ");
		for (i = 9; i >= 0; i --) {
			b[i] = a[i];
			System.out.println(b[i]);
		}
		in.close();
	}
	

		
}
