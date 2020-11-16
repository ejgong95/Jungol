import java.util.Scanner;

public class JO137 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		for (int i = 1; i < a + 1; i++) {
			// System.out.print(i + " ");
			for (int j = i; j < b + i; j++) {
				System.out.print(j + " ");

			}
			
			System.out.println();
		}

	}

}
