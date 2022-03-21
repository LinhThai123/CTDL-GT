public class _Find_Max_In_Arr {
      public static int findMax(int[] nums) {
            int maxXiMum = nums[0];
            for (int i = 1; i < nums.length; i++) {
                  if (nums[i] > maxXiMum) {
                        maxXiMum = nums[i];
                  }
            }
            return maxXiMum; 
      }
      public static void main(String[] args) {
            int[] nums = { 1, 4, 2, 6, 8 };
            findMax(nums);
            System.out.println(findMax(nums));
      }
}
