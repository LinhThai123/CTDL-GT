public class _So_Nguyen_To_In_Arr {
      public static int findSNT(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                   int snt = 0;
                  for (int j = 2; j < nums[i]/2; j++) {
                        if (nums[i] % j == 0) {
                              snt = 1; 
                        }
                  }
                  if (snt == 0 ) {
                        System.out.println(+ nums[i]);
                  }
            }
            return 0; 
      }
      public static void main(String[] args) {
            int[] nums = { 1, 3, 4, 7, 8 };
            System.out.println(findSNT(nums));
      }
}
