import java.util.HashMap;
import java.util.Map;

public class _290_Word_Pattern {
      public static void main(String[] args) {
            System.out.println(wordPattern("abba","dog cat dog dog"));
      }
      public  static boolean wordPattern(String pattern, String s) {
            char[] nums = pattern.toCharArray();
            String[] str = s.split(" ");
            if (nums.length != str.length) {
                  return false;
            }
            HashMap<Character, Integer> myPattern = new HashMap<>();
            HashMap<String, Integer> myS = new HashMap<>();
            for (var i = 0; i < nums.length; i++) {
                  var c1 = myPattern.put(nums[i], i);
                  var c2 = myS.put(str[i], i);
                  if (c1 != c2) {
                        return false; 
                  }
            }
            return true; 
      }
      public  static boolean wordPattern2(String s, String t) {
            Map<Character, String> H = new HashMap<>();
            String[] tArr = t.split(" ");
    
            if(s.length() != tArr.length) return false;
    
            for (int i = 0; i < s.length(); i++) {
                char ci = s.charAt(i);
                String ti = tArr[i];
                if(H.containsKey(ci)){
                    String dich = H.get(ci);
                    if(dich.equals(ti) == false){
                        return false;
                    }
                }else{
                    if(H.containsValue(ti)){
                        return false;
                    }
                    H.put(ci, ti);
                }
            }
            return true;
        }
}
