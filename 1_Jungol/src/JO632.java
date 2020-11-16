import java.util.Scanner;

public class JO632 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B, C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		int min = 0;
		if ((A < B) && (A < C)) {
			System.out.println(A);
		} else if ((B < A) && (B < C)) {
			System.out.println(B);
		} else
			System.out.println(C);

		if (A > B) {
			if (B > C) {
				min = C;
			} else { // (C>B)
				min = B;
			}
		} else { // (B<A)
			if (A > C) {
				min = C;
			} else { // (C>A)
				min = B;
			}
		}
		System.out.println(min);

		min = (A < B) ? ((A < C) ? A : C) : ((B < C) ? B : C);
		System.out.println(min);
	}

}
