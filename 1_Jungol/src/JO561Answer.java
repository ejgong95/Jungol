import java.util.Scanner;

public class JO561Answer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// 100�̸��� ���� �ִ밪���
		int max = -1; //
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 100) { //100�̸��� ���� �ɷ�����
				System.out.print(arr[i]+ " ");
				if(max < arr[i]) { // ���� if��
					max = arr[i];
				}
			}
		}
		System.out.println();
		System.out.println("max : " + max);
		
		int min = 9999;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] >= 100) { //100�̻��� ���� �ɷ�����
				System.out.print(arr[j]+ " ");
				if(min > arr[j]) {
					min = arr[j];
				}
			}
		}
		System.out.println();
		System.out.println("min : " + min);
		
	}

}
