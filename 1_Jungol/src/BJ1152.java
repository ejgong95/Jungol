import java.util.Scanner;

public class BJ1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				cnt++;
			}
		}

		if (str.charAt(0) == ' ') {
			if (str.charAt(str.length() - 1) == ' ') {
				System.out.println(cnt - 1);
			} else {
				System.out.println(cnt);
			}

		} else if (str.charAt(str.length() - 1) == ' ') {
			System.out.println(cnt);

		} else {
			System.out.println(cnt + 1);
		}
	}

}
