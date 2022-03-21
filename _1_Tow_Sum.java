
public class _1_Tow_Sum {
      public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            int[] result = new int[2];
            for (int i = 0; i < n; i++) {
                  for (int j = i + 1; j < n; j++) {
                        if (nums[i] + nums[j] == target) {
                              result[0] = i;
                              result[1] = j;
                        }
                  }
            }
            return result;
      }
      public static void main(String[] args) {
            int[] nums = { 3, 5, 2, 5 };
            _1_Tow_Sum obj = new _1_Tow_Sum();
            obj.twoSum(nums, 5);
            System.out.println("DONE");
      }
}
