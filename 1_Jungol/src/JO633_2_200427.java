import java.util.Scanner;

public class JO633_2_200427 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = 0;
		while (true) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number? ");
			number = sc.nextInt();
			System.out.println();
			boolean b = true;
			switch (number) {
			case 1:
				System.out.println("Seoul");
				break;
			case 2:
				System.out.println("Washington");
				break;
			case 3:
				System.out.println("Tokyo");
				break;
			case 4:
				System.out.println("Beijing");
				break;
			default:
				System.out.println("none");
				b = false;
			}
			if (b == false) {
				break;
			}

			System.out.println();

		}
		sc.close();

	}

}
