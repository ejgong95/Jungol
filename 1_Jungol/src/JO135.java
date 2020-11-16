import java.util.Scanner;

public class JO135 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int sum = 0;
		int cnt = 0;
		if (A > B) {
			for (int i = A; i >= B; i--) {
				if (i % 3 == 0 || i % 5 == 0) {
					sum += i;
					cnt++;
				}
			}
		} else if (A < B) {
			for (int i = B; i >= A; i--) {
				if (i % 3 == 0 || i % 5 == 0) {
					sum += i;
					cnt++;
				}
			}
		} else {
			
		}

		double avg = 0;
		avg = (double) sum / (double) cnt;

		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);

	}

}
