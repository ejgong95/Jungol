import java.util.Scanner;

public class JO183 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		
		sc.close();

		for (int i = 0; i < 5; i++) {
			System.out.print(str.charAt(i));
		}

	}

}
