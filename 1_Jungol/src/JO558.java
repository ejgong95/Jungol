import java.util.Scanner;

public class JO558 {

	public static void main(String[] args) {
		
		/*100 ���� ������ ������ �� �ִ� �迭�� �����ϰ� ������ ���ʷ� �Է¹޴ٰ�
		0 �� �ԷµǸ� 0 �� �����ϰ� �� ������ �Էµ� ������ 
		���� ���߿� �Էµ� �������� ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		// �� ���� 100���ϱ��??? --> �˳��� ũ��� ������ �Ѵ�....(�迭���Ѱ�
		int i = 0;
		do {
			arr[i] = sc.nextInt();
		}while(arr[i++] != 0);
		sc.close(); // while���� �������� �������� ��ĳ�� �ݱ�					
		
						//j < arr.length ��� j < i
						//i -> ������ ����� ��
		for (int j = 0; j < i; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		
		
					//i-2 ; �ε����� �����ֱ�����,,,,
					//while���� i++���� �����Ǳ⶧���� �װ��� �ѹ� �� ���ִ°ͤ���....
		for (int j = i-2; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}

	}

}
