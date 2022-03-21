public class findTuanTu {
      public static void main(String[] args) {
            int[] a = { 1, 4, 2, 5, 4, 6 };
            System.out.println(find(5, a));
      }

      public static int find(int x, int[] a) {
            int n = a.length;
            if (x < 0 || x > n) {
                  return 0;
            }
            return find2(x, a); 
      }

      public static int find2(int x, int[] a) {
            for (int i = 0; i < a.length; i++) {
                  if (a[i] == x) {
                        return i; 
                  }
            }
            return -1; 
      }
}
