public class _DeQuy {
      public static void main(String[] args) {
           System.out.println(giaiThua(6));
      }
      public static int giaiThua(int n) {
            if (n == 0)
                  return 1;
            int t = n * giaiThua(n - 1);  
            return t;  
      }
}
