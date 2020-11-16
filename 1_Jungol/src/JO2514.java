import java.util.Scanner;

public class JO2514 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		int cnt_k = 0;
		int cnt_i = 0;

		for (int i = 0; i < str.length(); i++) {
			if (i == 0 || i % 2 == 0) {
				if (str.charAt(i) == 'K') {
					cnt_k++;
				} else if (str.charAt(i) == 'I') {
					cnt_i++;
				}
			}
		}

		System.out.println(cnt_k);
		System.out.println(cnt_i - 1);

	}

}
