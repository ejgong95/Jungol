import java.util.Scanner;

public class JO596 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		// System.out.println(str);
		int num = sc.nextInt();
		sc.close();

		// System.out.println(str.length());

		for (int i = str.length() - 1, cnt = 0; cnt < num; cnt++, i--) {
			if (i >= 0) {
				System.out.print(str.charAt(i));
			}
		}

	}
}
