import java.util.Scanner;

public class JO633 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String a = "Seoul";
		String b = "Washington";
		String c = "Tokyo";
		String d = "Beijing";

		for (;;) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number? ");
			int num = sc.nextInt();
			System.out.println();
			if (num == 1) {
				System.out.println(a);
			} else if (num == 2) {
				System.out.println(b);
			} else if (num == 3) {
				System.out.println(c);
			} else if (num == 4) {
				System.out.println(d);
			} else {
				System.out.println("none");
				break;
			}
			System.out.println();
		}

		sc.close();

	}

}
