import java.util.Scanner;

public class JO171 {
	static int Summary(int a) {
		int result = 0;
		for (int i = 1; i <= a; i++) {
			result += i;
		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		Summary(a);

	}

}
