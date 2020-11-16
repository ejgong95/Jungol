import java.util.Scanner;

public class JO151 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(i == 0 || i == 2 || i == 4) {
				sum += arr[i];
			}
		}
		sc.close();
		System.out.println(sum);
	}

}
