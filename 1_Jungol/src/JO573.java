import java.util.Scanner;

public class JO573 {
	public static void number(int n) {
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		number(n);

	}

}
