public class _520_Detect_Capital {
      public static void main(String[] args) {
            
            System.out.println(detectCapitalUse("Usa"));
      }

      public static  boolean detectCapitalUse(String word) {
            char[] arr = word.toCharArray();
            int upCase = 0;
            int lowerCase = 0;
            if (word == null) {
                  return false; 
            }
            for (int i = 0; i < arr.length; i++) {
                  if (arr[i] >= 'a' && arr[i] <= 'z') {
                        lowerCase++;
                  } else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                        upCase++;
                  }
            }
            if (upCase == word.length() || lowerCase == word.length()) {
                  return true;
            }
            if (upCase == 1 && (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')) {
                  return true;
            }
            
            return false; 
      }
}
