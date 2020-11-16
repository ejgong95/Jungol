import java.util.Scanner;

public class JO129_1 {

	public static void main(String[] args) {

		int base = 0;
		int height = 0;
		double width = (base * height)/2;
		
		Scanner sc = new Scanner(System.in);
		for (;;) {
			base = sc.nextInt();
			height = sc.nextInt();
			System.out.println("Base = " + base);
			System.out.println("Height = " + height);
			System.out.printf("Triangle width = %.1f\n", width);
			System.out.println("Contitue? ");
			
			String tmp = sc.nextLine();
			if (tmp == "Y") {
				
			}else if (tmp == "N") {
				break;
			}
		}
		
	}

}
