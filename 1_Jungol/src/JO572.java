import java.util.Scanner;

public class JO572 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		Rd(r);
	}

	public static void Rd(int r) {
		double w = r * r * 3.14;
		System.out.printf("%.2f", w);

	}

}
