import java.util.Scanner;

public class JO1304Answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int[][] ar = new int[n][n];

		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// System.out.print(num++ + " ");
				ar[j][i] = num++; //��ǥ�� �������� => �¿찡�ƴ϶� ���Ϸ� ���� �־���
			}
			System.out.println();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

	}

}
