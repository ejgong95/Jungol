import java.util.Scanner;
import java.util.Stack;

public class JO1102 {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			char ch = sc.next().charAt(0);
			if (ch == 'i') {
				int a = sc.nextInt();
				stk.push(a);

			} else if (ch == 'o') {

				if (stk.empty()) {
					System.out.println("empty");
				} else {
					System.out.println(stk.pop());
				}
				/*
				 * 동일한 표현 if (!stk.isEmpty()) { stk.pop() }else { System.out.println("empty"); }
				 */
			} else if (ch == 'c') {
				System.out.println(stk.size());
			}
		}
		sc.close();
	}

}
