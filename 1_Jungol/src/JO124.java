import java.util.Scanner;

public class JO124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int month = 0;
		month = sc.nextInt();
		int p = 0;
		switch (month) {
		case 2:
			p = 28;
			break;
		case 4: case 6: case 9: case 11:
			p = 30;
			break;
		default:
			p = 31;
			break;
			
		}
		
		
		
		System.out.println(p);
		
		
		
		
		/*if (month == 2) {
			System.out.println("28");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("30");
		} else
			System.out.println("31");
		
		
		
		/*if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("31");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("30");
		} else
			System.out.println("28");
		*/
			
		
		
	}

}
