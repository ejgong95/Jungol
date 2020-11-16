import java.util.Scanner;

public class JO126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		for (;;) {
			int A = sc.nextInt();
			if (A % 2 != 0) {
				System.out.println("odd : ");
			}else if (A % 2 == 0) {
				System.out.println("even : ");
			}else
				break;
		}
		sc.close();
	}

}
