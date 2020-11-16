import java.util.Scanner;

public class JO575 {
	public static long multiply(long a, long b) {
		long result = a;
		if (b == 0) {
			result = 1;
		} else {
			for (int i = 1; i < b; i++) {
				result *= a;
			}
		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		multiply(a, b);
	}
}
