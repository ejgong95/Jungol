import java.util.Scanner;

public class JO2046 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int num = 1;

		if (m == 1) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(num + " ");
				}
				System.out.println();
				num++;
			}

		} else if (m == 2) {
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					
					for (int j = n; j > 0; j--) {
						System.out.print(j + " ");
					}
				} else if (i % 2 != 0) {
					for (int j = i; j < n; j--) {
						System.out.print(j + " ");
					}
				}
				
				System.out.println();
			}
		}

	}

}
