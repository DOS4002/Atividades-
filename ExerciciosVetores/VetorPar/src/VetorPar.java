import java.util.Scanner;
public class VetorPar {
	public static void main(String[] algs) {
		Scanner in = new Scanner (System.in);
		int a[], i, n;
		a = new int [10];
		n = 0;
		for (i = 0; i <= 9; i++) {
			a[i] = in.nextInt();
			System.out.print("Digite o " + (i + 1) + "º número: ");
			a[i] = in.nextInt();
			if (a[i] % 2 == 0) {
				System.out.println("É UM NÚMERO PAR!");
				n = n + 1;	
			}else {
				System.out.println("NÃO É PAR!");
			}
		}
		in.close();
	}

}
