public class _check_Char_In_String {
      public static void main(String[] args) {
          System.out.println(checkChar("linhlnhfl"));
      }

      public static int checkChar(String s) {
            char x = 'l';
            boolean findX = true;
            int count = 0; 
            char[] old = s.toCharArray();
            for (int i = 0; i < old.length; i++) {
                  if (x == old[i]) {
                        count++; 
                        findX = true;
                  }
            }
            if (findX == false) {
                  System.out.println("Khoogn thấy");
            }
            return count; 
      }
}
