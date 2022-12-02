import java.util.Scanner;
public class MaiorMenor {
	public static void main(String[] algs) {
		Scanner in = new Scanner (System.in);
		int a[], i, mr, mn;
		a = new int [10];
		mr = 0;
		mn = 0;
		for (i = 0; i <= 9; i++) {
			a[i] = in.nextInt();
			mn = a[i];
			if (a[i] > mr) {
				mr = a[i];
			}
			if (a[i] < mn) {
				mn = a[i];
			}
		}
		System.out.println("Maior idade: " + mr);
		System.out.println("Menor idade: "+ mn);
		in.close();
	}

}
