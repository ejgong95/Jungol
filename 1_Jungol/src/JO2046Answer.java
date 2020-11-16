import java.util.Scanner;

public class JO2046Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		sc.close();

		switch (m) {
		case 1:
			for (int i = 0; i < n; i++) {
				for (int j = 1; j <= n; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			break;
		case 2:
			for (int i = 1; i <= n; i++) {
				if (i % 2 != 0) { // �汝鶬�
					for (int j = 1; j <= n; j++) {
						System.out.print(j + " ");
					}
					System.out.println();

				} else { // 礎熱還
					for (int j = n; j >= 1; j--) {
						System.out.print(j + " ");
					}
					System.out.println();
				}

			}
			break;
		case 3:
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					System.out.print(i * j + " ");
				}
				System.out.println();
			}
			break;
		case 4 :
			 for (int i = 1; i <= n; i++) {
	                for (int j = 0; j < n; j++) {
	                    System.out.print(j + " ");
	                }
	                System.out.println();
	            }
			 break;
		}
		
		
	}

}
