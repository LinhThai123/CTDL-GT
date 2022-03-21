public class _revertSort {
      public static void main(String[] args) {
            int[] arr = { -1, 0, 5, 3 };
            _revertSort obj = new _revertSort();
            obj.revertSort(arr); 
      }

      public void revertSort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < arr.length / 2; i++) {
                  int temp = arr[i];
                  arr[i] = arr[arr.length - i - 1];
                  arr[arr.length - i - 1] = temp;
            }
            System.out.println(" \nMang sau khi dao chieu ");
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
      }
  }
