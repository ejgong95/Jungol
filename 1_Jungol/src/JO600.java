import java.util.Scanner;

public class JO600 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		sc.close();
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			// str.equals(anObject)
			if (str.charAt(i) == ' ') {
				cnt++;
			}
		}

		System.out.println(cnt + 1);
	}

}
