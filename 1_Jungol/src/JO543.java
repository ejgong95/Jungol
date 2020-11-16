import java.util.Scanner;

public class JO543 {

	public static void main(String[] args) {

		int num = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
		} else if (i % 2 != 0) {
			continue;
		}
		
		/*while (true) {
			num = sc.nextInt();
			if (even % 2 == 0);
			System.out.printf("%d ", num % 2);
			even++;
			
			
		}
		*/
		}
	}

}
