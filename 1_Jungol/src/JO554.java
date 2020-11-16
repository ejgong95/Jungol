import java.util.Scanner;

public class JO554 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();
		
		int num = 1;
		char ch = 'A';
		
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(num++ + " ");
			}
			for (int z = 0; z < i + 1; z++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}

	}

}
