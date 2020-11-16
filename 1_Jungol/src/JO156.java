import java.util.Scanner;

public class JO156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[100];
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] == 999) {
				break;
			}
			cnt++;
		}
		sc.close();

		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < cnt; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		// System.out.println(cnt);

	}

}
