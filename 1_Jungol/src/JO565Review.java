import java.util.Scanner;

public class JO565Review {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		int arr[] = new int[10];
					//���� �ڸ��� �迭 (0~9)
		int num = 0;
			
		do {
			num = sc.nextInt();
			//���ڸ� �Է¹޴´�
			if (num == 0)
				break;
			//0�� �ԷµǸ� �ݺ����� �����
			arr[num/10]++;
			//num/10 -> �� 10�� �ڸ�, �� �ڸ��� ������ ī��Ʈ�Ѵ�.
		}while (num != 0);
				// (���ǹ�)num�� 0�� �ƴ� ��� �ݺ����� ����Ѵ�.
		sc.close();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) { // ī��Ʈ�� ���� ���� �迭�� ������� �ʴ´�.
				System.out.println(i + " : " + arr[i]);
			}
		}

	}

}
