import java.util.Scanner;

public class JO546_3 {

	public static void main(String[] args) {
		// <배열> 이용
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		sc.close();		
//		System.out.println(n);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");		
//		}
		
		double avg = 0;
//		double avg1 = (double)(sum/n); 
//		double avg2 = (double) sum / n ;
//		double avg3 = (double) sum / (double) n ;
		avg = (double)sum / (double) n;
		
		System.out.printf("avg : %.1f\n", avg);
		
		if (avg >= 80.0) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

}
