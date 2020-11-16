import java.util.Scanner;

public class JO145 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int k = 2 * i; k < 2 * n - 2; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
			num = 1;
		}

	}

}
