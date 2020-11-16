import java.util.Scanner;

public class JO141 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int cnt = 1;
		int i = 0;
		do {
			i = num * cnt;
			cnt++;
			System.out.print(i + " ");
			if (i % 10 == 0) {
				break;
			}
		} while (num * cnt < 100);
	}

}
