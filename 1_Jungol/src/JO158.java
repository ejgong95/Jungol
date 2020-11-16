import java.util.Scanner;

public class JO158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[100];

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			cnt++;
			if (arr[i] == 0) {
				break;
			}
			if (arr[i] % 2 != 0) {
				arr[i] = arr[i] * 2;
			} else {
				arr[i] = arr[i] / 2;
			}

		}
		sc.close();
		System.out.println(cnt - 1);

		for (int i = 0; i < cnt - 1; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
