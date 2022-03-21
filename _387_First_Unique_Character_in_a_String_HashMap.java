import java.util.HashMap;
import java.util.Map;

public class _387_First_Unique_Character_in_a_String_HashMap {
      public static void main(String[] args) {
            String s = "ooolkk";
            System.out.println(firstUniqChar(s));
      }
      public static int firstUniqChar(String s) {
            Map<Character, Integer> myMap = new HashMap<>();
            for (var i = 0; i < s.length(); i++) {
                  if (myMap.containsKey(s.charAt(i)) == false) {
                        myMap.put(s.charAt(i), 1);
                  } else {
                        myMap.put(s.charAt(i), myMap.get(s.charAt(i))+1);
                  }
            }
            for (int i = 0; i < s.length(); i++) {
                  if (myMap.get(s.charAt(i)) == 1) {
                        return i; 
                  }
            }
            return -1; 
      }
}
