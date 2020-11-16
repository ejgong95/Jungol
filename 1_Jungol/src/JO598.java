import java.util.Scanner;

public class JO598 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.next();
			int num = (int) str.charAt(0);
			if (65 <= num && num <= 122) {
				System.out.println(str.charAt(0));
			} else if (48 <= num && num <= 57) {
				System.out.println(num);
			} else {
				//System.out.println(str.charAt(0));
				break;
			}
		}
		sc.close();
	}

}
