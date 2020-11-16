import java.util.Scanner;

public class JO540 {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * int num = 0, cnt = 0;
		 * while (true) { 
		 * int A = sc.nextInt();
		 * System.out.println(num); 
		 * if (num%3 != 0) {
		 * 
		 * } else if (num%3 == 0) {
		 * 
		 * }
		 */
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		while (flag) {
			int n = sc.nextInt();
			/*
			 * if(n%3 != 0) { // 3의 배수가 아닌 경우
			 */

			if (n % 3 == 0) {
				// 3의 배수
				System.out.println(n / 3);
			} else if (n == -1) {
				flag = false;
			}
		}

	}
}
