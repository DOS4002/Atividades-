import java.util.*;
public class Idade {
	public static void main (String[]algs) {
		
		Scanner in = new Scanner (System.in);
		int an, at, i, sub;
		do {
			System.out.println("Digite o ano do seu nascimento: ");
			an = in.nextInt();
			
			System.out.println("Digite o ano atual: ");
			at = in.nextInt();
			sub = at - an;
			
			System.out.println("A sua idade é " + sub);

			
			System.out.println("Deseja continuar? S/N? (Para S, digite 1 e para N, digite 2)");
			i = in.nextInt();
			
			
		} while (i == 1);
		in.close();
	}
}
