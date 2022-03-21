import java.util.HashMap;

public class _383_Ransom_Note {
      public static void main(String[] args) {
            System.out.println(canConstruct("aa", "ab"));
      }

      public static boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character, Integer> myMag = new HashMap<>();
            char[] arr1 = magazine.toCharArray();
            char[] arr2 = ransomNote.toCharArray();
            if (ransomNote.length() > magazine.length()) {
                  return false ; 
            }
            for (char c : arr1) {
                  myMag.put(c, myMag.getOrDefault(c, 0) + 1); 
            }
            for (char c : arr2) {
                  if (!myMag.containsKey(c) || myMag.get(c) == 0) {
                        return false;
                  }
                  else {
                        myMag.put(c, myMag.get(c) - 1);
                  }
            }
            return true;
      }
}
