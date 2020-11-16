import java.util.Scanner;

public class JO578yoko {
	public static void gugudan(int min, int max) {
		
		for (int i = min; i <= max; i++) {
			System.out.println("== " + i + "dan ==");
		}
		System.out.println();
	
	
		for (int i = 1; i <= 9; i++) {
			for (int j = min; j <= max; j++) {
				System.out.printf("%2d * %d = %2d", j, i, j*i);
			}
		}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int max, min;
		max = A > B ? A : B;
		min = A > B ? B : A;

//		for (int i = min; i <= max; i++) {
			gugudan(min, max);
//		}
	}

}
