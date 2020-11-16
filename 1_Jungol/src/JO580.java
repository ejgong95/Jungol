import java.util.Scanner;

public class JO580 {
	static void DateMethod(int m, int d) {
		if (m == 2) {
			if (1 <= d && d <= 28) {
				System.out.println("OK!");
			} else {
				System.out.println("BAD!");
			}
		}
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			if (1 <= d && d <= 31) {
				System.out.println("OK!");
			} else {
				System.out.println("BAD!");
			}
		}

		if (m == 4 || m == 6 || m == 9 || m == 11) {
			if (1 <= d && d <= 30) {
				System.out.println("OK!");
			} else {
				System.out.println("BAD!");
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int date = sc.nextInt();
		sc.close();
		DateMethod(month, date);
	}

}
