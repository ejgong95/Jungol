import java.util.Scanner;

public class JO182 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String x = sc.next();
		String y = sc.next();

		sc.close();

		System.out.println((int) x.charAt(0) + (int) y.charAt(0));

		int minus = (int) x.charAt(0) - (int) y.charAt(0);
		if (minus < 0) {
			minus = -minus;
		}

		System.out.println(minus);

	}

}
