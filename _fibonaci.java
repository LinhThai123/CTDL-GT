public class _fibonaci {
      public static void main(String[] args) {
            Finonaci(10);
      }

      public static int Finonaci(int n) {
            System.out.print(n +" ");
            if (n <= 2)
                  return 1;
            int f = Finonaci(n - 1) + Finonaci(n - 2);
            return f;
      }

      public static int fibo(int n)  {
            if (n <= 2) {
                  return 1;
            }
            int[] a = new int[n + 1]; 
            for (int i = 3; i < n; i++) {
                  a[i] = a[i - 1] + a[i - 2];
            }
            return a[n]; 
      }
}
