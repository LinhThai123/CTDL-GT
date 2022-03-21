public class _sumDeQuy {
      public static void main(String[] args) {
            int[] a = { 1, 2, 3 };
            System.out.println(sum(a,0)); 
      }
      public static int sum(int[]  a , int i ) {
            if (i >= a.length) {
                  return 0;
            }
            return a[i] + sum(a, i+1); 
      }
}
