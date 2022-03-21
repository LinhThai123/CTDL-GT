
public class _1346_Check_If_N_and_Its_Double_Exist {
      public static void main(String[] args) {
            int[] arr = { 7, 1, 14, 11 };
            _1346_Check_If_N_and_Its_Double_Exist obj = new _1346_Check_If_N_and_Its_Double_Exist();
            obj.checkIfExist(arr); 
      }
      public static boolean checkIfExist(int[] arr) {
            boolean check = false; 
            for (int i = 0; i < arr.length - 1; i++) {
                  for (int k = 0; k < arr.length; k++) {
                        if (arr[i] == 2 * arr[k]) {
                              return true;
                        }                        
                  }
            }
            return check; 
      }
}
