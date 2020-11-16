import java.util.Scanner;

public class JO144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = 2 * i + 2; j < 2 * n; j++) {
				System.out.print(" ");
			}
			for (int z = 0; z < 2 * i + 1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
