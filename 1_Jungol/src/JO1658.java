import java.util.Scanner;

public class JO1658 {

	static int gcd_get(int x, int y) {
		int i, ans = 0;
		for (i = 1; i <= x; i++) {
			if (x % i == 0 && y % i == 0) {
				ans = i;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		int gcd = 0;
		int lcm = 0;

		gcd = gcd_get(x, y);
		lcm = x * y / gcd;

		System.out.println(gcd);
		System.out.println(lcm);

	}

}
