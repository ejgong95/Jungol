import java.util.Scanner;

public class JO576 {

	static void Charmethod(int a, char ch, int b) {

		if (ch == '+') {
			System.out.printf("%d + %d = %d", a, b, a + b);
		} else if (ch == '-') {
			System.out.printf("%d - %d = %d", a, b, a - b);
		} else if (ch == '*') {
			System.out.printf("%d * %d = %d", a, b, a * b);
		} else if (ch == '/') {
			System.out.printf("%d / %d = %d", a, b, a / b);
		} else {
			System.out.printf("%d %c %d = 0", a, ch, b);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char ch = sc.next().charAt(0);
		int b = sc.nextInt();
		sc.close();

		Charmethod(a, ch, b);

	}

}
