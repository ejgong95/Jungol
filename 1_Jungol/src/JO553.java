import java.util.Scanner;

public class JO553 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int num = 65;
		
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print((char)num++);
			}
			for (int z = 0; z < i; z++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
