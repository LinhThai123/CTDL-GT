import java.lang.Math;
public class _pow {
      public static void main(String[] args) {
            // System.out.println(pow(2, 4));
            System.out.println(myPow(2, 4));
      }
      public static double pow( double k , int n ) {
            if (n == 1) {
                  return k;
            }
            return  Math.pow(k, n);
      }

      public static  double myPow(double x, int n) {
            if (n == 0) {
                  return 1;
            }
            return x * myPow(x, n - 1); 
      }
}
