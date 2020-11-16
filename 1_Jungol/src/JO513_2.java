
public class JO513_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double yd = 91.44d;
		double in = 2.54d;
		double res1 = 2.1;
		double res2 = 10.5;

		System.out.printf(" 2.1yd = %.1fcm\n", yd * res1);
		System.out.printf("10.5in =  %.1f" + "cm\n", in * res2);
		
		
		//자리정렬
		System.out.printf("%4.1fyd = %.1fcm\n", res1, yd * res1);
		//4.1?? 4 -> 공백자리를 포함한 숫자 자리 4자리를 맞추겠다
		//     .1 -> 소수첫째자리까지 출력
		System.out.printf("%4.1fin =  %.1f" + "cm\n", res2, in * res2);
		
	}

}
