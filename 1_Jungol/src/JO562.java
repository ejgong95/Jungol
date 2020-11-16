import java.util.Scanner;

public class JO562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		double sum1 = 0; // Â¦¼ö¹øÂ° - > i´Â È¦¼ö
		int sum2 = 0; // È¦¼ö¹øÂ° - > i´Â Â¦¼ö
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (i % 2 != 0) { //È¦¼ö ->Â¦¼ö
				sum2 += arr[i];
			} else { //Â¦¼ö -> È¦¼ö
				sum1 += arr[i];
			}
				//i = 0, 1ÀÏ¶§ ¾î¶»°Ô Ã³¸®ÇØ¾ßÇÒÁö
			
		}
		sc.close();
		//System.out.println(0%2);
		System.out.printf("sum : %d\n", sum2);
		System.out.printf("avg : %.1f", (sum1)/5);

	}

}
