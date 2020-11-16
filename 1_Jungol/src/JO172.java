import java.util.Scanner;

public class JO172 {
	public static void Square(int n) {

		for (int i = 0; i < n; i++) {
			int num = 1;
			for (int j = 0; j < n; j++) {
				System.out.print(num++ * (i + 1) + " ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		Square(n);

	}

}
