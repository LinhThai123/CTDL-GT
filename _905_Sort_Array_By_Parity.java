public class _905_Sort_Array_By_Parity {
      public static void main(String[] args) {
            int[] nums = { 3, 6, 2, 1 };
            _905_Sort_Array_By_Parity obj = new _905_Sort_Array_By_Parity();
            obj.sortArrayByParity(nums);
      }

      public static void sortArrayByParity(int[] nums) {
            int n = nums.length ; 
            int left = 0;
            int right = n - 1;

            while (left < right) {
                  if (nums[left] % 2 != 0 && nums[right] % 2 == 0) {
                        int t = nums[left];
                        nums[left] = nums[right];
                        nums[right] = t;
                  }
                  if (nums[left] % 2 == 0) {
                        left++;
                  }
                  if (nums[right] % 2 != 0) {
                        right--; 
                   }     
            }
            // return a; 
            System.out.println("mang sau khi sap xep ");
            for (int i = 0; i < nums.length; i++) {
                  System.out.print(nums[i] + " ");
            }
      }
}
