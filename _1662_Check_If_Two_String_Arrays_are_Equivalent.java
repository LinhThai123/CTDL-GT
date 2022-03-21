public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
      public static void main(String[] args) {        
            _1662_Check_If_Two_String_Arrays_are_Equivalent 
            obj = new _1662_Check_If_Two_String_Arrays_are_Equivalent();
            String [] word1 = {"ab","c"};
            String [] word2 = {"a", "bc"};
            obj.arrayStringsAreEqual(word1, word2);
            // System.out.println("DONE");
      }
      public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            String s1 = "";
            for (String str : word1) {
                  s1 += str;
            }
            String s2 = "";
            for (String str : word2) {
                  s2 += str;
            }
            return s1.toString().equals(s2.toString()); 
      }
}
