import javax.lang.model.util.ElementScanner6;

public class _704_Binary_Search {
      public static void main(String[] args) {
            // int[] nums = { 1, 3, 5, 6, 7, 8 };
            // System.out.println(search(nums,7));
            int[] a = { 1, 2, 3, 4, 6, 8 };
            System.out.println(_binarySeacher2(a, 2));
      }

      public static int search(int[] nums, int target) {
            int n = nums.length;
            int left = 0;
            int right = n - 1;
            while (left <= right) {
                  int midle = (left + right) / 2;
                  if (target == nums[midle]) {
                        return midle;
                  } else if (left < nums[midle]) {
                        left = midle + 1;
                  } else {
                        right = midle - 1;
                  }
            }
            return -1;
      }

      public static int _binarySeacher(int[] a, int x, int left, int right) {
            if (left > right) {
                  return -1;
            }
            int mid = (left + right) / 2;
            if (x == a[mid]) {
                  return mid;
            }
            else if (x > a[mid]) {
                  return _binarySeacher(a, x, mid + 1, right); 
            }
            else {
                  return _binarySeacher(a, x, left, mid - 1); 
            }
      }

      public static int _binarySeacher2(int[] a, int x) {
            int n = a.length; 
           return _binarySeacher(a, x, 0, n - 1);
      }
}
