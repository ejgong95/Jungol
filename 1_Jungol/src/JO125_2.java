import java.util.Scanner;

public class JO125_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		int j = 1;
		while (j <= num) {
			System.out.print(j++ + " "); // ����� �����ϰ� j������
		}
		System.out.println();
		// �������� ��� �����ϴ���

		int k = 1;
		do {
			System.out.print(k + " ");
		} while (k++ < num);
		// ������ üũ�ϰ� ����

	}

}
