import java.util.Scanner;

public class JO599 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		//String strarr[] = new String[str.length()];
		
		//System.out.println(strarr[0]);
		
		for (int i = 0; i < str.length(); i++) {
			
			if (65 <= (int)str.charAt(i) && (int)str.charAt(i) <= 122) {
				System.out.print(str.toUpperCase().charAt(i));
			} else {
				System.out.print("");
			}
		}
		
		
		
		
		

	}

}
