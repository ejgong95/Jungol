import java.util.Scanner;

public class JO140 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];

		int sum = 0;
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];

			if (arr[i] == 0) {
				break;
			}
			cnt++;
		}
		sc.close();

		int avg = sum / cnt;
		if (cnt < 20) {
			
		} else {
			cnt = 20;
		}
		System.out.println(sum + " " + avg);
		// System.out.printf(avg);
		//System.out.println(cnt);
	}

}
