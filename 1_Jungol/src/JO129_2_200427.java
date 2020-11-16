import java.util.Scanner;

public class JO129_2_200427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int base = 0;
		int height = 0;
		char c = ' ';

		while (true) {
			System.out.print("Base = ");
			base = sc.nextInt();
			System.out.print("Height = ");
			height = sc.nextInt();
			double width = ((double) base * (double) height) / 2;
			System.out.printf("Triangle width = %.1f\n", width);
			System.out.print("Continue? ");

			c = sc.next().charAt(0);

			if (c == 'Y' || c == 'y') {
				continue;
			} else {
				break;
			}
		}
		sc.close();

	}

}
