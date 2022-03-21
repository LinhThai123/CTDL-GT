import java.util.Arrays;

public class test {
      public static void main(String[] args) {
            int[] a = { 5,2,8,3,1 };
            test obj = new test();
            System.out.println(sort(a));
      }

      public static int sort(int[] a) {
            Arrays.sort(a);
            int max1 = a[a.length - 1] * a[a.length - 2] * a[a.length -3];
            int max2 = a[0] * a[1] * a[3];
            int kq = max1<= max2 ?  max2 :  max1 ; 
            return kq; 
      }
}
