import java.util.Scanner;

public class JO559 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double ar[] = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0}; //변수선언동시에 값 대입
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();
		
		System.out.println(ar[inp1-1] + ar[inp2-1]); //인덱스는 0부터시작
		
		
		
		
		
		
		
//		double[] arr;
//		arr = new double[]{85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
//		
//		
//		int num1 = 0;
//		int num2 = 0;
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		
//		System.out.printf("arr[%d]+arr[%d]",num1,num2);
//		
		
		
		
		
	}

}
