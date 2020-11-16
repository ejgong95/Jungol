import java.util.Scanner;

public class JO602 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strarr = new String[5];

		for (int i = 0; i < strarr.length; i++) {
			strarr[i] = sc.next();
		}
		sc.close();
		for (int i = strarr.length - 1; i >= 0; i--) {
			System.out.println(strarr[i]);
		}

	}

}
