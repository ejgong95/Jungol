import java.util.Scanner;

public class JO546_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = 0;
		N = sc.nextInt();
		int i = 0;
		int score = 0;
		int sum = 0;
		while (i++ < N) {
			score = sc.nextInt();
			sum += score;
		}

		double avg = 0;
		avg = (double)sum / N;
		System.out.printf("avg : %.1f\n", avg);
		if (avg >= 80) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

}
