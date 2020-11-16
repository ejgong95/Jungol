import java.util.Scanner;

public class JO135Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		if (A > B) {
			//swap
			int tmp = B;
			B = A;
			A = tmp;
		}
		int sum = 0;
		int cnt = 0;
		for (int i = A; i <= B; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				//System.out.print(i + " ");
				sum += i;
				cnt++;
			}
		}
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double)sum/(double)cnt);
		
		

	}

}
