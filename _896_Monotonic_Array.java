public class _896_Monotonic_Array {
      public static void main(String[] args) {
            int[] nums = { 1, 4, 2, 3 };
            System.out.println(isMonotonic(nums));
      }

      public static boolean isMonotonic(int[] nums) {
            if (nums.length == 1)
                  return true;

            int inc = 0;
            int dec = 0;
            for (int i = 1; i < nums.length; i++) {
                  if (nums[i] - nums[i - 1] <= 0) {
                        dec++;
                  }
                  if (nums[i] - nums[i - 1] >= 0) {
                        inc++;
                  }
            }

            if (inc == nums.length - 1 || dec == nums.length - 1) {
                  return true;
            }
            return false; 
      }
}
