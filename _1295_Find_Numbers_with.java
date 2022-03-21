public class _1295_Find_Numbers_with {
      public static int findNumbers(int[] nums) {
            int count = 0;
            for (int i : nums) {
                  int soLuongChuSo = tinhSoChuSo(i);
                  if (soLuongChuSo % 2 == 0) {
                        count++; 
                  }
            }
            return count; 
      }
      private static int tinhSoChuSo(int i) {
            int bienDem = 0;
            int kq = i;
            while (kq != 0) {
                  kq = i / 10;
                  i = kq; 
                  bienDem++; 
            }
            return bienDem;
      }
      public static void main(String[] args) {
            int[] nums = { 1, 22, 3243, 412 };
            // _1295_Find_Numbers_with obj = new _1295_Find_Numbers_with(); 
            System.out.println(findNumbers(nums));          
      }
}