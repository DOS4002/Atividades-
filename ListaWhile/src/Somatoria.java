public class Somatoria {
	public static void main(String[] algs) {
		int i=1, n=1;
		do {
			i = i + 1;
			n = n + i;
		}while (i <= 100);
		
		System.out.println("A somatória de 1 a 100 é "+n);	
	}
}
