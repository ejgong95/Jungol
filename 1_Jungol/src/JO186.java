import java.util.Scanner;

public class JO186 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		sc.close();
		
		if (str1.length() > str2.length()) {
			System.out.println(str1.length());
		} else if (str2.length() > str1.length()) {
			System.out.println(str2.length());
		} else {
			System.out.println(str1.length());
		}
		
	}

}
