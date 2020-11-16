import java.util.Scanner;

public class JO185 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char ch = sc.next().charAt(0);
		sc.close();
		int cnt_no = 0;
		int cnt_same = 0;

		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == ch) {
				cnt_no++;
				break;
			}
			cnt_same++;
			
		}

		if (cnt_no == 0) {
			System.out.println("No");
		} else {
			System.out.println(cnt_same);
		}

	}

}
