public class _724_Find_Pivot_Index {
      public static void main(String[] args) {
            int[] nums = { 1, 7, 3, 6, 5, 6 };
            System.out.println(pivotIndex2(nums));
      }
// 19h39
      public static int pivotIndex2(int[] nums) {
            int kq = -1;
            int n = nums.length;
            int iL = 0;
            int iR = 0;
            for (int i = iL; i < nums.length; i++) {
                  iL += nums[i];
            }
            for (int i = n - 1; i >= 0; i--) {
                  iL -= nums[i];
                  if (iL == iR) {
                        kq = i;
                  }
                  iR += nums[i];
            }
            return kq;
      }
      /**
       * _724_Find_Pivot_Index 
       */
            public static boolean isPivot(int[] a, int i) {
                  int tongBenTrai = 0;
                  for (int j = 0; j <= i - 1; j++) {
                        tongBenTrai += a[j];
                  }

                  int tongBenPhai = 0;
                  for (int j = i + 1; j <= a.length - 1; j++) {
                        tongBenPhai += a[j];
                  }

                  return tongBenTrai == tongBenPhai;
            }
            public static int pivotIndex1(int[] a) {
                  for (int i = 0; i < a.length; i++) {
                        if (isPivot(a, i) == true) {
                              return i;
                        }
                  }
                  return -1;
            }
            // Cách 3  
            public static int pivotIndex3(int[] a) {
                  int tongBenTrai = 0;
                  int tongBenPhai = 0;
          
                  int SUM = 0;
                  // n
                  for (int ai : a) {
                      SUM += ai;
                  }
          
                  //3n + n = 4n | 10 =? 40| 1000 =4 000
                  // n^2 = 10 =? 1000 |1.000.000
                  for (int i = 0; i < a.length; i++) {
                      if(i-1 >= 0){
                          tongBenTrai = tongBenTrai + a[i-1];
                      }
          
                      tongBenPhai = SUM - tongBenTrai - a[i];
          
                      if(tongBenTrai == tongBenPhai){
                          return i;
                      }
                  }
                  return -1;
             }
}
