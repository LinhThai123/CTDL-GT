public class _747_Largest_Number_At_Least_Twice_of_Others {
      public static void main(String[] args) {
      }
      public static int dominantIndex(int[] nums) {
            int max = nums[0];
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    index = i;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != nums[index] && max < nums[i] * 2) {
                    return -1;
                }
            }
            return index;
        }
}
