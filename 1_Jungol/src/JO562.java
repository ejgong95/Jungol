import java.util.Scanner;

public class JO562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		double sum1 = 0; // ¦����° - > i�� Ȧ��
		int sum2 = 0; // Ȧ����° - > i�� ¦��
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (i % 2 != 0) { //Ȧ�� ->¦��
				sum2 += arr[i];
			} else { //¦�� -> Ȧ��
				sum1 += arr[i];
			}
				//i = 0, 1�϶� ��� ó���ؾ�����
			
		}
		sc.close();
		//System.out.println(0%2);
		System.out.printf("sum : %d\n", sum2);
		System.out.printf("avg : %.1f", (sum1)/5);

	}

}
