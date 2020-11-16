import java.util.Scanner;

public class JO1304 {
	static int n, m;
	static int[][] ar;

	public static void printArray() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();
		ar = new int[n][m];

		int num = 1;
//		for (int i = 0; i < n; i++) {
//			if (i % 2 == 0) {
//				for (int j = 0; j < m; j++) {
//					ar[i][j] = num++;
//				}
//			} else {
//				for (int j = m - 1; j >= 0; j--) {
//					ar[i][j] = num++;
//				}
//			}
//		}
		
		printArray();
	}

}
