import java.util.Scanner;

public class JO128 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int cnt = 0;
		
		while (true) {
			num = sc.nextInt();
			
			if (num % 3 != 0 && num % 5 != 0) {
				cnt++;
			} else if(num == 0) {
				break;
			}
		}
		System.out.println(cnt);
	}

}
