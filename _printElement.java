public class _printElement {
      public static void main(String[] args) {
            int[] arr = { 1, 8, 3, 4, 8, 6, 7 };
            printElement(arr, 6);
      }
      public static void printElement(int[] arr, int index) {
            if (index < 0 || index >= arr.length)
                  return;
            System.out.print(arr[index]);
            printElement(arr, index - 1);
      }
}
