import java.util.Scanner;

public class JO126_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int odd = 0, even = 0;
		
		
		while(true) {
			num = sc.nextInt();
			if (num == 0)
				break;
			else if (num % 2 == 0)
				even++;
			else
				odd++;
		}
		
		System.out.printf("odd : %d\n", odd);
		System.out.printf("even : %d\n", even);
		
		
	}

}
