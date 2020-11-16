import java.util.Scanner;

public class JO136 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = N * (i + 1);
			System.out.println(arr[i]);
		}

	}

}
