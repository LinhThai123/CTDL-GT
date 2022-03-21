public class _1550_Three_Consecutive_Odds {
      public static void main(String[] args) {
            int[] arr = { 2,6,4,1};
            System.out.println(threeConsecutiveOdds(arr));
      }

      public static boolean threeConsecutiveOdds(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                  if (arr[i]%2 != 0) {
                        count++;
                  }
                  else {
                        count = 0;
                  }
                  if (count == 3) {
                        return true; 
                  }
            }
            return false; 
      }
}
