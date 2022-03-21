import java.util.Arrays;

public class _912_Sort_an_Array {
      public static void main(String[] args) {
            int arr[] = { 3,7,5,2,8,5,9,10 };
            System.out.println("Mang ban đau:");
            printArray(arr);

            _912_Sort_an_Array ob = new _912_Sort_an_Array();
            ob.sort(arr, 0, arr.length - 1);

            System.out.println("Mang sau khi sap xep:");
            printArray(arr);
      }

      public static void merge(int[] arr, int l, int m, int r) {
            // Tạo ra kích thước 2 mảng con
            int n1 = m - l + 1;
            int n2 = r - m;
            // Tạo ra 2 mảng con
            int left[] = new int[n1];
            int right[] = new int[n2];
            // Sao chép dữ liệu vào cá cmangr mới tạo
            for (int i = 0; i < n1; i++) {
                  left[i] = arr[l + i];
            }
            for (int j = 0; j < n2; j++) {
                  right[j] = arr[m + 1 + j];
            }
            // Tạo ra các chỉ mục cho 2 mảng con
            int i = 0;
            int j = 0;
            // Gán k vào đầu mảng 
            int k = l;
            while (i < n1 && j < n2) {
                  if (left[i] <= right[j]) {
                        arr[k] = left[i];
                        i++;
                  } else {
                        arr[k] = right[j];
                        j++;
                  }
                  k++;
            }
            while (i < n1) {
                  arr[k] = left[i];
                  i++;
                  k++;
            }

            // Sao chép các phần tử còn lại của R[] nếu có
            while (j < n2) {
                  arr[k] = right[j];
                  j++;
                  k++;
            }
      }

      public static void sort(int arr[], int l, int r) {
            if (l < r) {
                  // Tìm điểm chính giữa
                  int m = (l + r) / 2;
                  // Hàm đệ quy tiếp tục chia đôi
                  sort(arr, l, m);
                  sort(arr, m + 1, r);
                  merge(arr, l, m, r);
            }
      }

      // In các phần tử của mảng
      public static void printArray(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                  System.out.print(arr[i] + " ");
            System.out.println();
      }
}
