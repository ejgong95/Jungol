import java.util.Scanner;

public class JO533 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char S = ' ';
		int A = 0;
		S = sc.next().charAt(0);
		A = sc.nextInt();
		if (S == 'M') {
			if (A >= 18) {
				System.out.print("MAN");
			} else
				System.out.print("BOY");
		}
		if (S == 'F') {
			if (A >= 18) {
				System.out.print("WOMAN");
			}else 
				System.out.print("GIRL");
		}
		
	}

}
