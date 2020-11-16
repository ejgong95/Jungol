import java.util.Scanner;

public class JO557 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] ch = new char[10];

		for (int i = 0; i < ch.length; i++) {
			ch[i] = sc.next().charAt(0);
			if (i == 0) {
				System.out.print(ch[0] + " ");
			}
			if (i == 3) {
				System.out.print(ch[3] + " ");
			}
			if (i == 6) {
				System.out.print(ch[6] + " ");
			}
		} 
		
		//while
		int i = 0;
		while(i < ch.length) {
			ch[i++] = sc.next().charAt(0);
		}
		sc.close();
		/*잘출력되는지 확인하기
		for (int j =0; j < ch.length; j++) {
			System.out.print(ch[j] + " ");
		}
		*/
		System.out.print(ch[0] + " " + ch[3] + " " + ch[6]);

		
	}

}
