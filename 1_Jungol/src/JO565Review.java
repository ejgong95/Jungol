import java.util.Scanner;

public class JO565Review {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		int arr[] = new int[10];
					//십의 자리의 배열 (0~9)
		int num = 0;
			
		do {
			num = sc.nextInt();
			//숫자를 입력받는다
			if (num == 0)
				break;
			//0이 입력되면 반복문을 멈춘다
			arr[num/10]++;
			//num/10 -> 곧 10의 자리, 각 자리의 갯수를 카운트한다.
		}while (num != 0);
				// (조건문)num이 0이 아닐 경우 반복문을 계속한다.
		sc.close();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) { // 카운트가 되지 않은 배열은 출력하지 않는다.
				System.out.println(i + " : " + arr[i]);
			}
		}

	}

}
