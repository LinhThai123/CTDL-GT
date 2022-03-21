import java.util.HashMap;

public class _205_Isomorphic_Strings {
      public static void main(String[] args) {
            System.out.println(isIsomorphic("agh", "ddd"));
      }

      public static  boolean isIsomorphic(String s, String t) {
            HashMap<Character , Character> myMap = new HashMap<>(); 
            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();
            if (arr1.length != arr2.length) {
                  return false;
            }
            for (var i = 0; i < s.length(); i++) {
                  var c1 = s.charAt(i);
                  var t1 = arr2[i]; 
                  if (myMap.containsKey(c1)) {
                        var translate = myMap.get(c1);
                        if (translate.equals(t1) == false) {
                              return false;
                        }
                  }
                  else {
                        if (myMap.containsValue(t1)) {
                              return false;
                        }
                        myMap.put(c1, t1); 
                  }
            }
            return true; 
      }
}
