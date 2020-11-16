import java.util.Scanner;

public class JO154_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];

		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] == -1) {
				break;
			}
			cnt++;
		}
		sc.close();
//		for (int i = 0; i < cnt; i++) {
//			System.out.print(arr[i] + " ");
//		}
//
//		System.out.println();
//		System.out.print(cnt);
//		System.out.println();

		if (cnt < 3) {
			if (arr[2] == -1) {
				System.out.print(arr[0] + " " + arr[1]);
			} else if (arr[1] == -1) {
				System.out.print(arr[0]);
			}

		} else {
			System.out.print(arr[cnt - 3] + " " + arr[cnt - 2] + " " + arr[cnt - 1]);
		}

	}
}
