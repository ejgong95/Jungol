import java.util.Scanner;

public class JO1314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		sc.close();

		int num = 1;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[j][i] = num++;
					if (num == 27) {
						num = 1;
					}
				}
			} else {
				for (int j = n - 1; j >= 0; j--) {
					arr[j][i] = num++;
					if (num == 27) {
						num = 1;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((char) (arr[i][j] + 64) + " ");
			}
			System.out.println();
		}
	}
}
