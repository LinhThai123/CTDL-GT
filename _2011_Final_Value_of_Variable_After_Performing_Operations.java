public class _2011_Final_Value_of_Variable_After_Performing_Operations {
      public static void main(String[] args) {
            String[] operations = { "--X", "X++", "X++" };
            System.out.println(finalValueAfterOperations(operations));
      }

      public static  int finalValueAfterOperations(String[] operations) {
            int x = 0;
            int n = operations.length;
            for (int i = 0; i < n; i++) {
                  String s = operations[i];
                  char n1 = s.charAt(0);
                  char n2 = s.charAt(1);
                  if (n1 == '+') {
                        ++x;
                  }
                  else if (n1 == '-') {
                        --x;
                  }
                  else if (n2 == '+') {
                        x++;
                  }
                  else {
                        x-- ;
                  }
            }
            return x ; 
      }
}
