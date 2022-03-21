public class _283_Move_Zeroes {
      public static void main(String[] args) {
            int[] nums = { 1, 0, 3, 0, 7, 8 };
            _283_Move_Zeroes obj = new _283_Move_Zeroes();
            obj.moveZeroes(nums);
            // System.out.println("DONE");
      }

      public void moveZeroes(int[] nums) {
            int n = nums.length;
            int index = 0; 
            for (int i = 0; i < n; i++) {
                  if (nums[i] != 0) {
                        nums[index++] = nums[i];
                  }
                  else {
                 }
            }
            System.out.println(" \nMang sau khi sap xep ");
            for (int i = 0; i < nums.length; i++) {
                  System.out.print(nums[i] + " ");
            }
      }
}
