import java.util.Scanner;

public class JO564Answer {

	public static void main(String[] args) {
		// 무한루프

		Scanner sc = new Scanner(System.in);
		char c;
		int cnt[] = new int[26];

//		for (int i = 0; i < cnt.length; i++) {
//			System.out.print(cnt[i] + " ");
//		} // 0으로 초기화해보기
//
//		for (int i = 0; i < cnt.length; i++) {
//			cnt[i] = 0;
//		}

//		System.out.println();
//		System.out.println('A');
//		System.out.println('A' - 'A'); // = 0
//		System.out.println('B' - 'A'); // = 1
		// System.out.println(c -'A');

		do {

			c = sc.next().charAt(0);
//			System.out.println(c); 출력해보깅
//			if (c == 'A') {
//				cnt[0]++;
//			}else if (c == 'B') {
//				cnt[1]++;
			if (('A' > c) || (c > 'Z'))
				break;
			cnt[c - 'A']++;
		} while ('A' <= c && c <= 'Z');
		sc.close();
//		System.out.println();
		char d = 'A';
		for (int i = 0; i < cnt.length; i++) {
			if(cnt[i] != 0)
			System.out.println((char) (d + i) + " : " + cnt[i]);
		}

	}

}
