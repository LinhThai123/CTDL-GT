public class _Avg_Number_Old {
      public static int tinhTrungBinhCongOld(int[] nums) {
            int count = 0;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                  if (nums[i] % 2 == 1) {
                        count++;
                        sum += nums[i];
                  }
            }
            System.out.println("Trung bình cộng : " +(float)sum/count);
            return 0;
      }
      public static void main(String[] args) {
            int[] nums = { 1, 2, 3, 6 };
            System.out.println(tinhTrungBinhCongOld(nums));
      }
}