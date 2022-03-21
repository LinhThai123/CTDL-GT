import java.util.Arrays;

public class _bubbleSort {
      public static void main(String[] args) {
            int[] arr = { 1, 4, 2, 5, 3, 7, 6 };
            _bubbleSort obj = new _bubbleSort();
            // obj.bubleSort(arr);
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
      }

      public void bubleSort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                  for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] > arr[j]) {
                              int temp = arr[i];
                              arr[i] = arr[j];
                              arr[j] = temp;
                        }
                  }
            }
            System.out.println("Mang sau khi sap xep ");
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
      }
}
