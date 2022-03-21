import java.util.Arrays;

public class _414_Third_Maximum_Number {
      public static void main(String[] args) {
            int[] a = { 1,1,2 };
            System.out.println(thirdMax(a));
      }
      public static int thirdMax(int[] a) {
            Arrays.sort(a);
            int position = 0 ; 
            for (int i = 0; i < a.length; i++) {
                  if (a[i] != a[position]) {
                        position++;
                  }
                  a[i] = a[position];
            }
            return position >= 2 ? a[position-2] : a[position];
      }
}
