import java.util.Scanner;

public class JO154 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double[] arr = new double[6];
		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		sc.close();

		double avg = sum / 6;
		System.out.printf("%.1f", avg);
	}

}
