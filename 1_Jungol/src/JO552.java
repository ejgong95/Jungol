import java.util.Scanner;

public class JO552 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			if (N % 2 != 0) {
				for (int z = 2 * i; z < 2 * N - 1; z++) {
					System.out.print("*");
				}
			} else {
				for (int z = 2 * i; z < 2 * N; z++) {
					System.out.print("*");
				}
//				System.out.print("*");

			}

			System.out.println();
		}
	}

}
