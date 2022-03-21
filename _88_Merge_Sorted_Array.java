public class _88_Merge_Sorted_Array {
      public void merge(int[] nums1, int m, int[] nums2, int n) {
           for (int ai : nums2) {
                 chenPhanTuVaoMang(ai, nums1, m);
                 m++;
           }
      }
      private void chenPhanTuVaoMang(int x, int[] a, int m) {
            boolean isFindIndexK = false;
            for (int k = 0; k < m; k++) {
                  if (a[k] > x) {
                        isFindIndexK = true;
                        for (int i = m - 1; i >= k; i--) {
                              a[i+1] = a[i];
                        }
                  }
                  a[k] = x;
                  break;
            }
            if (isFindIndexK == false) {
                  a[m] = x; 
            }
      }
      public static void main(String[] args) {
            int[] nums1 = { 2, 3, 4, 5, 0, 0, 0 };
            int[] nums2 = { 0, 3, 6 };
            _88_Merge_Sorted_Array obj = new _88_Merge_Sorted_Array();
            obj.merge(nums1, 4, nums2, 3);
            // System.out.println("DONE");
      }
}
