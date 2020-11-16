import java.util.Scanner;

public class JO150 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		String str = " ";

		char[] chArr = new char[10];

		for (int i = 0; i < chArr.length; i++) {
			chArr[i] = sc.next().charAt(0);
		}
		sc.close();

//		for (int i = 0; i < chArr.length; i++) {
//			System.out.print(chArr[i]+ " ");
//		}

		for (int i = chArr.length - 1; i >= 0; i--) {
			System.out.print(chArr[i] + " ");
		}

	}

}
