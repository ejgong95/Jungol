import java.util.Scanner;

public class JO604 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();

		}
		char ch = sc.next().charAt(0);
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].charAt(arr[i].length() - 1) == ch) {
				System.out.println(arr[i]);
			} else {
				System.out.print("");
			}
		}

	}

}
