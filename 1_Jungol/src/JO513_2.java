
public class JO513_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double yd = 91.44d;
		double in = 2.54d;
		double res1 = 2.1;
		double res2 = 10.5;

		System.out.printf(" 2.1yd = %.1fcm\n", yd * res1);
		System.out.printf("10.5in =  %.1f" + "cm\n", in * res2);
		
		
		//�ڸ�����
		System.out.printf("%4.1fyd = %.1fcm\n", res1, yd * res1);
		//4.1?? 4 -> �����ڸ��� ������ ���� �ڸ� 4�ڸ��� ���߰ڴ�
		//     .1 -> �Ҽ�ù°�ڸ����� ���
		System.out.printf("%4.1fin =  %.1f" + "cm\n", res2, in * res2);
		
	}

}
