import java.util.Scanner;

public class JO597 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		sc.close();
		
		int length = A.length() + B.length();
		
		System.out.print(length);
	}

}
