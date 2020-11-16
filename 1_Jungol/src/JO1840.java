import java.util.Scanner;

public class JO1840 {
   static int coin;
   static int side;
   static int c[];

   public static void coin(int n) {
      int i;

      if (n == coin) {
         for (i = 0; i < coin; i++) {
            System.out.print(c[i] - 1);
         }
         System.out.println();
         return;
      }

      for (i = 1; i <= side; i++) {
         c[n] = i;
         coin(n + 1);
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int C = sc.nextInt();
      int S = sc.nextInt();
      sc.close();

      coin = C;
      side = S;
      c = new int[C];

      coin(0);
   }
}


