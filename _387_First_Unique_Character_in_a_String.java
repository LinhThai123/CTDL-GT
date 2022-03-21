import java.util.concurrent.ForkJoinPool;

public class _387_First_Unique_Character_in_a_String {
      public static int firstUniqChar(String s) {
            char[] arr = s.toCharArray();
            int[] nums = new int[s.length()];
            for (int i = 0; i < arr.length; i++) {
                  int count = 0 ; 
                  for (int j = 0; j < nums.length; j++) {
                        if (nums[j] == arr[i]) {
                              count++;
                        }
                  }
                  nums[i] = count; 
            }
            for (int i = 0; i < arr.length; i++) {
                  if (nums[i] == 1) {
                        System.out.println(arr[i]);
                  }
                  return i; 
            }
            return -1; 
            // public int firstUniqChar(String s) {
            //       int[] chars = new int[26];
            //       for(char c : s.toCharArray()){
            //           chars[c - 'a']++;
            //       }
                  
            //       for(int i = 0; i < s.length(); i++){
            //           if(chars[s.charAt(i) - 'a'] == 1) return i;
            //       }
                  
            //       return -1;
            //   }
      }
      public static void main(String[] args) {
            String s = "ooolkk";
            System.out.println(firstUniqChar(s));
      }
}
