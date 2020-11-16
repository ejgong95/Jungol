import java.util.Scanner;

public class JO582 {
	static void Rmethod(double width) {
		double r;
		width = r * r * 3.14;
		r = width / 3.14 ;
		System.out.printf("%.2f", r / r);
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double width = sc.nextDouble();
		sc.close();
		Rmethod(width);
	}

}
