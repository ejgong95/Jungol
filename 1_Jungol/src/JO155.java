import java.util.Scanner;

public class JO155 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] arr = new char[6];
		arr[6] = {'J', 'U', 'N', 'G', 'O', 'L'};
		char ch = ' ';
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0);
			if (ch != arr[i]) {
				System.out.println("none");
			}
		}

	}

}
