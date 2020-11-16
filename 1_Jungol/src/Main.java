import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		long result = 0 ;
		for (int i = 1; i <= b; i++) {
			result *= a;
		}
		System.out.println(result);
		

	}

}
