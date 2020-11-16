import java.util.Scanner;

public class JO561 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int max = 1;
		int min = 9999;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max && arr[i] < 100) {
				max = arr[i];
			} else if (arr[i] < min && arr[i] >= 100) {
				min = arr[i];
			}
		}
		
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > max && arr[j] < 100) {
				max = arr[j];
			}
		}
		for (int z = 0; z < arr.length; z++) {
			if (arr[z] < min && arr[z] > 100) {
				min = arr[z];
			}
		}
		
		
		//만약 해당하는 수가 없을 때에는 100 을 출력한다. <<--어떻게해야해ㅡㅡ
		
		System.out.printf("%d %d", max, min);
	}

}
