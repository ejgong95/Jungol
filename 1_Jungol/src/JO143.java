import java.util.Scanner;

public class JO143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int z = 0; z < i; z++) {
				System.out.print(" ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			for (int j = i; j < n - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int z = i; z < n - 2; z++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 3; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
