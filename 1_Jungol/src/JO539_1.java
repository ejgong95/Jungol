import java.util.Scanner;
/*
 * ������ ��� �Է¹޴ٰ� 100 �̻��� ���� �Է��� �Ǹ� ������ 
 * �Էµ� ���� �����Ͽ� �հ�� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
(����� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� ����Ѵ�.)
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
			cnt++;  // ���� ���� ����
					// cnt = cnt + 1;
			if (n >= 100) break;
		}
		sc.close();
		System.out.println(sum);
		System.out.printf("%.1f\n",(double)sum/cnt);
		
		
		
		
		
		
				
	}

}
