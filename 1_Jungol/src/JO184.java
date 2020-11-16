import java.util.Scanner;

public class JO184 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			if(65 <= str.charAt(i) && str.charAt(i) <= 90) {
				System.out.print(str.toLowerCase().charAt(i));
			} else if (48 <= str.charAt(i) && str.charAt(i) <= 57) {
				System.out.print(str.charAt(i));
			} else if (97 <= str.charAt(i) && str.charAt(i) <= 122) {
				System.out.print(str.charAt(i));
			} else {
				System.out.print("");
			}
		}
		
	}

}
