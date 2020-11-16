import java.util.Scanner;

public class JO152 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		int oddsum = 0;
		int evensum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (i % 2 == 1) {
				evensum += arr[i];
			} else {
				oddsum += arr[i];
			}
		}
		sc.close();
		System.out.printf("odd : %d\n", oddsum);
		System.out.printf("even : %d", evensum);

	}

}
