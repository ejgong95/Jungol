import java.util.Scanner;

public class JO147 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k < n; k++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}

	}

}
