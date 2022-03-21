public class _max_Less_Than {
      public static void main(String[] args) {
            int[] arr = { 0, 1, -2, 4, 8 };
            System.out.println(maxLessThan(arr));
      }

      public static int maxLessThan(int[] arr) {
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                 for (int j = i; j < arr.length; j++) {
                       if (arr[i] > 0) {
                             if (arr[i] > max) {
                                   max = arr[i];
                             }
                       }
                 }
            }
            return max; 
      }
}
