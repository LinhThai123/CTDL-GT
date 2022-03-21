import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _389_Find_the_Difference {
      public static void main(String[] args) {
            System.out.println(findTheDifference2("abcd", "abcde"));
      }

      public static char findTheDifference(String s, String t) {
            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();
            int sum1 = 0;
            int sum2 = 0;

            for (int i = 0; i < arr1.length; i++) {
                  sum1 += (char) arr1[i];
            }
            for (int i = 0; i < arr2.length; i++) {
                  sum2 += (char) arr2[i];
            }
            int ketqua = sum2 - sum1;
            return (char) ketqua;
      }

      public static char findTheDifference2(String s, String t) {
            HashMap<Character, Integer> map = new HashMap<>();
            char[] nums = t.toCharArray();
            for (char c : nums) {
                  map.put(c, map.getOrDefault(c, 0) + 1);
            }

            char ans = t.charAt(0);
            for (int i = 0; i < s.length(); i++) {
                  char ch = s.charAt(i);
                  if (map.containsKey(ch)) {
                        map.put(ch, map.get(ch) - 1);
                  }
            }
            for (Entry<Character, Integer> entry : map.entrySet()) {
                  if (entry.getValue() != 0)
                        ans = entry.getKey();
            }
            return ans;
      }

      // public static char findTheDifference3(String s, String t) {
      //       Map<Character, Integer> h1 = new HashMap<>();
      //       Map<Character, Integer> h2= new HashMap<>();
      //       char[] arr = s.toCharArray();
      //       char[] arr2 = t.toCharArray(); 
      //       for (char c : arr) {
      //             if (h1.containsKey(c) == true) {
      //                   int newVal = h1.get(c);
      //                   h1.put(c, newVal + 1);
      //             } else {
      //                   h1.put(c, 1);
      //             }
      //       }
      //       for (char r : arr2) {
      //             if (h2.containsKey(r) == true) {
      //                   int newVal = h2.get(r);
      //                   h1.put(r, newVal + 1);
      //             } else {
      //                   h1.put(r, 1);
      //             }
      //       }
      //       for (var key : h2.keySet()) {
      //             if (h1.containsKey(h2) == true) {

      //             } else {
      //                   return key;
      //             }
      //       }
      //       for (char c : h1.keySet()) {
      //             int v1 = h1.get(c);
      //             int v2 = h1.get(c);
      //             if (v1 < v2) {
      //                   return c; 
      //             }
      //       }
      //       return '-'; 
      // }
}
