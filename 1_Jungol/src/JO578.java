import java.util.Scanner;

public class JO578 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if (a > b) {
			int tmp = a;
			a = b;
			b = tmp;
		}

		for (int i = a; i <= 10; i++) {

			if (i == b + 1) {
				break;
			}

			System.out.printf("== %ddan ==\n", a++);

			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\n", i, j, i * j);

			}
			System.out.println();

		}

	}

}
