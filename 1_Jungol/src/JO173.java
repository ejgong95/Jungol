import java.util.Scanner;

public class JO173 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		double D = power(X, N); //È£Ãâ

		System.out.printf("%d", (int) D);

	}

	static double power(int x, int n) {
		double result1 = Math.pow(x, 2);
		double result2 = Math.pow(n, 2);
		if (result1 > result2) {
			return (result1 - result2);
		} else if (result2 > result1) {
			return (result2 - result1);
		} else {
			return 0.0;
		}
	}

}
