import java.util.Scanner;

public class JO146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		char ch = 'A';
		int num = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(ch++ + " ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print(num++ + " ");
			}

			System.out.println();
		}

	}

}
