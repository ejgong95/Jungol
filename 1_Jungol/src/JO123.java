import java.util.Scanner;

public class JO123 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Number? ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.print("dog");
			break;
		case 2:
			System.out.print("cat");
			break;
		case 3:
			System.out.print("chick");
			break;
		default:
			System.out.print("I don't know");

		}

	}

}
