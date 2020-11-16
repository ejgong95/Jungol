import java.util.Scanner;

public class JO545 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		
		for (int i =1; i <=10; i++) {
			num = sc.nextInt();
			
			if (num % 3 == 0) {
				cnt1++;
			}
			if (num % 5 == 0) {
				cnt2++;
			}
			
		}
		System.out.println("Multiples of 3 : " + cnt1);
		System.out.println("Multiples of 5 : " + cnt2);
		sc.close();
		
		
	}

}
