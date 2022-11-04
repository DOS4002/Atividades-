import java.util.Scanner;
public class Tabuada {
	public static void main(String[] algs) {
		Scanner in = new Scanner(System.in);
		int i, n, res;
		
		System.out.print("Digite um número: ");
		n = in.nextInt();
		System.out.println();		
		for(i = 1; i <= 10; i++){
			res = n * i;
			System.out.println(n+" x "+i+ " = "+ res);
		}
		in.close();
	}

}
