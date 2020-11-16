import java.util.Scanner;

public class JO125_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		int j = 1;
		while (j <= num) {
			System.out.print(j++ + " "); // 출력을 먼저하고 j값증가
		}
		System.out.println();
		// 증감식이 어디에 들어가야하는지

		int k = 1;
		do {
			System.out.print(k + " ");
		} while (k++ < num);
		// 조건을 체크하고 증가

	}

}
