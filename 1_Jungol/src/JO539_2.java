import java.util.Scanner;

public class JO539_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = 0;
		int sum = 0;
		int cnt = 0;
		do {
			A = sc.nextInt();
			sum += A;
			cnt++;

		} while (A < 100);
		sc.close();

		double avg = 0.0;
		avg = (double) sum / (double) cnt;
		System.out.println(sum);
		System.out.printf("%.1f", avg);

	}

}
