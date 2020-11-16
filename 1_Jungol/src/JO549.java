import java.util.Scanner;

public class JO549 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();
		int sum = 0;
		int cnt = 0;
		int i = 1;
		do {
			if (i % 2 != 0) {
				sum += i;
				cnt++;
			}
			i++;
		} while (sum < n);

		System.out.printf("%d %d", cnt, sum);
	}

}
