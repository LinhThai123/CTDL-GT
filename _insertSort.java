public class _insertSort {
      public static void main(String[] args) {
            int[] arr = { 8, 4, 9, 2, 5, 4, 7, 0 };
            _insertSort obj = new _insertSort();
            obj.insertSort(arr);          
      }

      public void insertSort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                  int position = arr[i];
                  int j = i - 1;
                  while (j >= 0 && position > arr[j]) {
                        arr[j + 1] = arr[j];
                        j--;
                  }
                  arr[j + 1] = position;
            }
            System.out.println(" \nMang sau khi sap xep ");
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
     }
}
