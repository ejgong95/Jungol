import java.util.Scanner;

public class JO594 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// scanner�� ��ü�� ����
		// reference��������
		String str = sc.nextLine();
		// String str2 = new String(str1);
		sc.close();

		for (int i = 0; i < 2; i++) {
			System.out.print(str);
		}
		System.out.println();
		System.out.print(str + str);

	}

}
