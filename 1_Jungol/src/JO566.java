import java.util.Scanner;

public class JO566 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int arr[] = new int[100];
		
		arr[0] = 100;
		arr[1] = sc.nextInt();
		
		System.out.print(arr[0] + " " + arr[1]);
		for (int i = 2; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
