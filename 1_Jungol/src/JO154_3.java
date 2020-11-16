import java.util.Scanner;

public class JO154_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[100];
		int i = 0;
		boolean b = true;
		do {
			ar[i] = sc.nextInt();
			if (ar[i] == -1) {
				b = false;
			}
			i++;
		} while (b);
		sc.close();

		for (int j = 0; j < i; j++) {
			System.out.print(ar[j] + " ");
		}

		System.out.println("\n" + ar[i - 1]);
		
		int j = i - 4;
		if (i < 4)
		for (int j = i - 4, cnt = 0; cnt < 3; cnt++, j++) {
			System.out.print(ar[j] + " ");
		}

	}

}
