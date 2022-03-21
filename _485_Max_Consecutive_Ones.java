public class _485_Max_Consecutive_Ones {
      public static void main(String[] args) {
            int[] nums = { 1, 1, 1, 0, 1 };
            System.out.println(findMaxConsecutiveOnes2(nums));
      }  

      public static int findMaxConsecutiveOnes(int[] nums) {
            int max = 0;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                  if (nums[i] == 1) {
                        count++;
                  } else {
                        if (count > max) {
                              max = count;
                        }
                        count = 0;
                  }
            }
            if (max < count) {
                  max = count;
            }
            return max;
      }

      public static int findMaxConsecutiveOnes2(int[] a) {
            int max = 0;
            int count = 0;
            // duyệt mảng 
            for (int i = 0; i < a.length; i++) {
                  if (a[i] == 0) {
                        count = 0;
                  }
                  else {
                        count++;
                        max = (count > max) ? count : max; 
                  }
            }
            return max;  
      } 
}
