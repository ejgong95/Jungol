import java.util.Scanner;

public class JO551 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < N; i++) {
			for (int z = 0; z < i; z++) {
				System.out.print(" ");
			}
			for (int j = i; j < N; j++) {				
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
