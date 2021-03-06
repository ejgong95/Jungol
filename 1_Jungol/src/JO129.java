import java.util.Scanner;

public class JO129 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int base = 0;
		int height = 0;
		char ch = ' ';
		do {
			System.out.print("Base = ");
			base = sc.nextInt();
			System.out.print("Height = ");
			height = sc.nextInt();
			double width = (double) (base * height) / 2;
			System.out.printf("Triangle width = %.1f\n", width);
			System.out.print("Continue? ");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		sc.close();
	}

}
