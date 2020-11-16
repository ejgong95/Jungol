import java.util.Scanner;

public class JO574 {
	static int MAXmethod(int a, int b, int c) {
		int arr[] = { a, b, c };

		int max = -1000000000;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		MAXmethod(a, b, c);

	}

}
