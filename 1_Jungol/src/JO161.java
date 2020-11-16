import java.util.Scanner;

public class JO161 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int score[] = new int[100];
		int inp = 0;
		
		do {
			inp = sc.nextInt();

			if (inp == 0) {
				break;
			}
			score[inp / 10]++; 

		} while (inp != 0);
		sc.close();

		for (int i = 10; i >= 0; i--) {
			if (score[i] != 0) {
				System.out.println(i * 10 + " : " + score[i] + " person");
			}

		}

		// System.out.println(46/10);

	}

}
