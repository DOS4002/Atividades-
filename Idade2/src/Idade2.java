import java.util.*;
public class Idade2 {
public static void main(String[]algs) {
	Scanner in = new Scanner (System.in);
	
	int an, at, i, age, mr, mn;
	mn = 0;
	mr = 0;
	for (i = 1; i <= 10; i++) {
		System.out.println("Digite o ano do seu nascimento: ");
		an = in.nextInt();
		
		System.out.println("Digite o ano atual: ");
		at = in.nextInt();
		
		age = at - an;
		mn = age;
		System.out.println("Sua idade é: " + age);
	
		if (mr < age) {
			mr = age;
		}
		
		if (mn > age) {
			mn = age;
		}
	}
	System.out.println();
	System.out.println("O mais velho tem " + mr + " anos de idade.");
	System.out.println();
	System.out.println("O mais novo tem " + mn + " anos de idade.");
}
}
