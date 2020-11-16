import java.util.Scanner;

public class JO565 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];

		int inp = 0;

		do {
			inp = sc.nextInt();
			if (inp == 0)
				break;
			arr[inp / 10]++; // 해당 배열의 인덱스를 1씩 증가시킨다

		} while (inp != 0);
		sc.close();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println(i + " : " + arr[i]);
			}
		}

	}

}
