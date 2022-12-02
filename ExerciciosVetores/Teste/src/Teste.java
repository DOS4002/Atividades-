import java.util.Scanner;
public class Teste {
	public static void main(String []algs) {
		Scanner in = new Scanner (System.in);
		double b;
		int i, a[]; 
		
		a = new int[10];
		for (i = 0; i <= 9; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			a[i] = in.nextInt();
			b = Math.sqrt(a[i]);
			System.out.println("A raiz quadrada de A " + (i + 1) + "º é igual a: " + b);
			System.out.println();
 		}
		in.close();
		
	}
}
