import java.util.*;
public class INSS {
	public static void main (String[] algs) {
		
		Scanner in = new Scanner (System.in);
		int i;
		double s, inss;
		
		for (i = 1; i <= 4; i++) {
			
			System.out.print("Digite o sal�rio do usu�rio: R$");
			s = in.nextDouble();
			
			if (s < 2000) {
				inss = s - (s * 8.5 / 100);
				System.out.println("O sal�rio descontado do INSS do usu�rio � de R$" + inss);
			} else {
				inss = s - (s * 11 / 100);
				System.out.println("O sal�rio descontado do INSS do usu�rio � de R$" + inss);
			}
			System.out.println();
		}
		in.close();
	}
}
