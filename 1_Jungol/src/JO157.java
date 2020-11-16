import java.util.Scanner;

public class JO157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[100];
		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] % 5 == 0) {
				sum += arr[i];
				cnt++;
			}
			if (arr[i] == 0) {
				break;
			}

		}
		sc.close();
		double avg = (double) sum / (double) (cnt - 1);

		System.out.println("Multiples of 5 : " + (cnt - 1));
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);

	}

}
