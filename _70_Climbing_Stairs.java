public class _70_Climbing_Stairs {
      public static void main(String[] args) {
            System.out.println(climbStairs(3));
      }
      public static int climbStairs(int n) {
            if (n <= 2) {
                  return n;
            }
            int[] a = new int[n + 1];
            for (int i = 3; i <= a.length ; i++) {
                  a[n] = a[n-1] + a[n-2] ; 
            }
            return a[n] ; 
      }
}
