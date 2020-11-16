import java.util.Scanner;

public class JO1719 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		switch (m) {
		case 1:
			for (int i = 0; i < n - 2; i++) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();

			}
			for (int i = 0; i < n - 3; i++) {
				for (int j = i; j < n - 3; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			break;

		case 2:
			for (int i = 0; i < n - 2; i++) {

				for (int j = i; j < n - 3; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < i + 1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}

			for (int i = 0; i < n - 3; i++) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print(" ");
				}
				for (int k = i; k < n - 3; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;

		case 3:
			for (int i = 0; i < n - 2; i++) {
				for (int k = 0; k < i; k++) {
					System.out.print(" ");
				}
				for (int j = 2 * i; j < n; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i = 0; i < n - 3; i++) {
				for (int j = i; j < n - 4; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < (2 * (i + 1)) + 1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;

		case 4:
			for (int i = 0; i < n - 2; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int k = i; k < n - 2; k++) {
					System.out.print("*");
				}
				System.out.println();
			}

			for (int i = 0; i < n - 3; i++) {
				for (int j = 0; j < n - 3; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < (n - 3) + i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;

		default:
			System.out.println("INPUT ERROR!");

		}

	}

}
