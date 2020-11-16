import java.util.Scanner;

public class JO153 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			cnt++;
			if (arr[i] == -1) {
				break;
			}
		}
		sc.close();

		if (cnt == 1) {

		} else if (cnt == 2) {
			System.out.print(arr[0]);
		} else if (cnt == 3) {
			System.out.print(arr[0] + " " + arr[1]);
		} else
			// System.out.println(cnt);
			System.out.printf("%d %d %d", arr[cnt - 4], arr[cnt - 3], arr[cnt - 2]);
	}

}
