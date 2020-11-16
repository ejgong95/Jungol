import java.util.Scanner;
/*
 * 정수를 계속 입력받다가 100 이상의 수가 입력이 되면 마지막 
 * 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오. 
(평균은 반올림하여 소수 첫째자리까지 출력한다.)
 */

public class JO539_1 {

	public static void main(String[] args) {

		/*int num = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			num = sc.nextInt();
			System.out.print(num + " ");
			if (num < 100) {
				System.out.print(num);
			} else {
				System.out.println("2");
				break;
			}
		}
		System.out.println("sum");
		System.out.print("avg");
		*/
		Scanner sc = new Scanner(System.in);
		int sum = 0, cnt = 0;
		while (true) {
			int n = sc.nextInt();
			sum += n; // sum = sum + n;
			cnt++;  // 갯수 세는 변수
					// cnt = cnt + 1;
			if (n >= 100) break;
		}
		sc.close();
		System.out.println(sum);
		System.out.printf("%.1f\n",(double)sum/cnt);
		
		
		
		
		
		
				
	}

}
