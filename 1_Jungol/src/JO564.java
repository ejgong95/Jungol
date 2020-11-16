import java.util.Scanner;

public class JO564 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] arr = new char[25];
		int cnt = 0;
		char ch = ' ';
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
	}

}
