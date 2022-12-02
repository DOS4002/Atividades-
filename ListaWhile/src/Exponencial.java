import java.util.Scanner;
public class Exponencial {
	public static void main(String[] algs) {
		Scanner in = new Scanner (System.in);
		int b, expo, res, i;
		
		System.out.print("Digite a base da potência: ");
		b = in.nextInt();
		System.out.print("Digite o expoente da potência: ");
		expo = in.nextInt();
		res = 1;
		i = 1;
		while (i <= expo) {
			res = res * b;
			i = i + 1;
		}
		System.out.println("O resultado dessa potência "+ res);
		in.close();
	}
	

}
