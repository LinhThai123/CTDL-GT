public class _1299_Replace_Elements_with_Greatest_Element_on_Right_Side {
      public static void main(String[] args) {
            int[] arr = { 17, 18, 5, 4, 6, 1 };
            _1299_Replace_Elements_with_Greatest_Element_on_Right_Side obj = new _1299_Replace_Elements_with_Greatest_Element_on_Right_Side();
            obj.replaceElements(arr);
      }
      public static void replaceElements(int[] arr) {
            int n = arr.length ; 
            int valMax = arr[n-1] ;
             arr[n-1] = -1 ;  
             for (int i = n - 2; i >= 0; i--) {
                   if (arr[i] > valMax) {
                         int temp = arr[i];
                         arr[i] = valMax;
                         valMax = temp;
                   } else {
                         arr[i] = valMax;
                   }
             }
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
            // return arr; 
      }
}
