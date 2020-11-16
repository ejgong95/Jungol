import java.util.Scanner;

public class JO1856_2 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		int num = 1;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				System.out.print(num++ + " ");
//			}
//			System.out.println();
//		}
//		sc.close();
//		
		int ar[][] = new int[3][4];
		ar[0][0] = 1;
		ar[0][1] = 2;
		
		System.out.println(ar.length);
		System.out.println(ar[0].length);
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
