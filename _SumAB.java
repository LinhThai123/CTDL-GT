public class _SumAB {
      public static void main(String[] args) {
            System.out.println(sum(2, 8));
      } 

      public static int sum(int a, int b) {
            if (a > b) {
               return 0 ; 
         }   
            return sum2(a, b) ; 
      }
      public static int sum2(int a, int b) {
            int iTong = 0; 
            for (int i = a; i <= b; i++) {
                  iTong += i ;  
            }
            return iTong; 
      }

}
