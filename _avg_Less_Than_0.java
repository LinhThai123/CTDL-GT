public class _avg_Less_Than_0 {
      public static void main(String[] args) {
            int[] arr = { -1, 3, -4, 5, 7 };
            System.out.println(avgLessThan(arr));
      }

      public static int avgLessThan(int[] arr) {
            float sum = 0;
            for (int i = 0; i < arr.length; i++) {
                  int count = 0; 
                  if (arr[i] > 0) {
                        count++;
                        sum += arr[i]; 
                  }
            } 
            return (int)sum;
      }
}
