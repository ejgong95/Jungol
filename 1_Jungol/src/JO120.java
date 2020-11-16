import java.util.Scanner;

public class JO120 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		if (A > B) {
			System.out.println(A-B);
		} else if (B > A) {
			System.out.println(B-A);
		}
		
		System.out.println(Math.abs(A-B));
	}

}
