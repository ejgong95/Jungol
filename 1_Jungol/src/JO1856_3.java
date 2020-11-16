import java.util.Scanner;

public class JO1856_3 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C[][] = new int[A][B];
      int D = 1;

      for (int i = 0; i < A; i++) { // = ar.length
         if (i % 2 == 0) {
            for (int j = 0; j < B; j++) { // = ar[0].length
               C[i][j] = D++;
               System.out.print(C[i][j] + " ");
            }
         } else {
            for (int j = B - 1; j >= 0; j--) {
               C[i][j] = D++;
               System.out.print(C[i][j] + " ");
            }
         }
         System.out.println();
      }
      sc.close();

   }
}