import java.util.Scanner;

public class JO1303 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int num = 1;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				System.out.print(num++ + " ");
				//System.out.printf("%2d ", num++);
			}
			System.out.println();
		}

	}

}
