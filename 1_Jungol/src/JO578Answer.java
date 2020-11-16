import java.util.Scanner;

public class JO578Answer {
	public static void gugudan(int p) {
		System.out.println("== " + p + "dan ==");
		for (int i = 1; i <= 9; i++) {
			//System.out.println(p + " * " + p + " = " + p * i);
			System.out.printf("%d * %d = %2d\n", p, i, p * i);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int max, min;
		max = A > B ? A : B;
		min = A > B ? B : A;
		
		for (int i = min; i <= max; i++) {
			gugudan(i);
		}		

	}

}
