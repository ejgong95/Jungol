import java.util.Scanner;

public class JO558 {

	public static void main(String[] args) {
		
		/*100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가
		0 이 입력되면 0 을 제외하고 그 때까지 입력된 정수를 
		가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.*/
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		// 왜 하필 100개일까요??? --> 넉넉한 크기로 선언을 한다....(배열의한계
		int i = 0;
		do {
			arr[i] = sc.nextInt();
		}while(arr[i++] != 0);
		sc.close(); // while문을 빠져나간 시점에서 스캐너 닫기					
		
						//j < arr.length 대신 j < i
						//i -> 위에서 저장된 값
		for (int j = 0; j < i; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		
		
					//i-2 ; 인덱스를 맞춰주기위해,,,,
					//while문의 i++에서 증감되기때문에 그것을 한번 더 빼주는것ㅇㅁ....
		for (int j = i-2; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}

	}

}
