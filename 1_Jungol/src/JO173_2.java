import java.util.Scanner;

public class JO173_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int r;
		if(A > B) {
			r = (A * A) - (B * B);
		} else {
			r = (int)Math.pow(B, 2) - (int)Math.pow(A, 2);
		}
		System.out.println(r);
	}

}
