import java.util.Arrays;
import java.util.HashMap;

public class _506_Relative_Ranks {
      public static void main(String[] args) {
            int[] score = { 5, 4, 3, 2, 1 };
            System.out.println(findRelativeRanks(score));
      }
      public static String[] findRelativeRanks(int[] score) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < score.length; i++) {
                  map.put(score[i], i);    
              }
              Arrays.sort(score);
              String[] result = new String[score.length];
              int place = 1;
              for (int i = score.length - 1; i >= 0; i--) {
                  int currScore = score[i];
                  int initIndex = map.get(currScore);
                  if (place == 1) {
                      result[initIndex] = "Gold Medal";
                  }
                  else if (place == 2) {
                      result[initIndex] = "Silver Medal";
                  }
                  else if (place == 3) {
                      result[initIndex] = "Bronze Medal";
                  }
                  else {
                      result[initIndex] = String.valueOf(place);
                  }
                  place++;
              }
              
              return result;

      }
}
