import java.util.Scanner;

public class JO521 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

//		--B;
//
//		int num = A * B;
//
//		A++;
		
		int num = A++ * --B;
		
		System.out.print(A + " ");
		System.out.print(B + " ");
		System.out.print(num);
	}

}
