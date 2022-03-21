public class _1089_Duplicate_Zeros {
      public static void main(String[] args) {
            int[] arr = { 1, 0, 2, 4, 0, 5, 4 };
            _1089_Duplicate_Zeros obj = new _1089_Duplicate_Zeros();
            obj.duplicateZeros(arr);
            System.out.println("Done");
      }

      public void duplicateZeros(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                  if (arr[i] == 0) {
                        for (int j = arr.length - 1; j > i; j--) {
                              arr[j] = arr[j - 1];
                        }
                        i++; 
                  }
            } 
      }
}
