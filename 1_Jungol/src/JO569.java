import java.util.Scanner;

public class JO569 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[5][4];

		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				switch (i) {
				case 0:
					sum1 += arr[0][j];
				case 1:
					sum2 += arr[1][j];
				case 2:
					sum3 += arr[2][j];
				case 3:
					sum4 += arr[3][j];
				case 4:
					sum5 += arr[4][j];
				}

			}
		}

		for (int j = 0; j < arr.length; j++) {

		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

//		System.out.println(sum1);
//		System.out.println(sum2);
//		System.out.println(sum3);
//		System.out.println(sum4);
//		System.out.println(sum5);

		int cnt = 0;
		if ((double) (sum1 / 4) >= 80) {
			System.out.println("pass");
			cnt++;
		} else {
			System.out.println("fail");
		}
		if ((double) (sum2 / 4) >= 80) {
			System.out.println("pass");
			cnt++;
		} else {
			System.out.println("fail");
		}
		if ((double) (sum3 / 4) >= 80) {
			System.out.println("pass");
			cnt++;
		} else {
			System.out.println("fail");
		}
		if ((double) (sum4 / 4) >= 80) {
			System.out.println("pass");
			cnt++;
		} else {
			System.out.println("fail");
		}
		if ((double) (sum5 / 4) >= 80) {
			System.out.println("pass");
			cnt++;
		} else {
			System.out.println("fail");

		}

		System.out.println("Successful : " + cnt);

	}

}
