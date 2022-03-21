public class MyTest {
      public static String change(String s) {
            char[] newArr = s.toCharArray();
            int head = 0;
            for (int last = newArr.length - 1; last > head; last--, head++) {
                  char temp;
                  temp = newArr[head];
                  newArr[head] = newArr[last];
                  newArr[last] = temp;
            }
            s = String.valueOf(newArr);
            return s;
      }

      public static boolean isEvenNumber(int n) {
            System.out.println(n);
            return n % 2 == 0;
      }

      public static void main(String[] args) {
            // System.out.println(change("abc"));
            // boolean kq = isEvenNumber(1) && isEvenNumber(2);
            // boolean k = isEvenNumber(3) || isEvenNumber(4) || isEvenNumber(5);
            boolean m = isEvenNumber(1) || isEvenNumber(2) && isEvenNumber(6) || isEvenNumber(7) && isEvenNumber(8);
          
      }
}
