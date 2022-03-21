public class _1859_Sorting_the_Sentence {
      public static void main(String[] args) {
            System.out.println(sortSentence("is2 sentence4 This1 a3"));
      }
      public static String sortSentence(String s) {
            String[] arr = s.split(" ");
            String[] temp = new String[arr.length];
            
            for (String word : arr) {
                  int n = (int) word.length() - 1; 
                 temp[word.charAt(n) - '1'] = word.substring(0,n);
           }
           return String.join(" ",temp);
   }
}
