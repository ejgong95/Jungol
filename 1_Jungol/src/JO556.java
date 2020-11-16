import java.util.Scanner;

public class JO556 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[100];
		arr[0] = 100;
		arr[1] = sc.nextInt();
		sc.close();

		int cnt = 0;

		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 2] - arr[i - 1];
		}

		for (int i = 0; i < arr.length; i++) {
			cnt++;
			if (arr[i] < 0) {
				break;
			}
		}

//		System.out.println(cnt);

		for (int i = 0; i < cnt; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
