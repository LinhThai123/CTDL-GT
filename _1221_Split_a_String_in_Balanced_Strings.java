public class _1221_Split_a_String_in_Balanced_Strings {
      public static void main(String[] args) {
            String s = "RLLLLRRRLR";
            System.out.println(balancedStringSplit(s));
      }
      public static int balancedStringSplit(String s) {
            int l = 0;
            int r = 0;
            int count = 0;
            char[] array = s.toCharArray();
            for (int i = 0; i < array.length; i++) {
                  if (array[i] == 'L') {
                        l++;
                  } else {
                        r++;
                  }
                  if (l == r) {
                        count++;
                        l = 0;
                        r = 0; 
                  }
            }
            return count;  
      }
}
