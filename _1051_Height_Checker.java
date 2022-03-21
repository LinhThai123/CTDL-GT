import java.util.Arrays;

public class _1051_Height_Checker {
      public static void main(String[] args) {
            int[] heights = { 1, 1, 4, 2, 1, 3 };
            System.out.println(heightChecker(heights));
      }

      public static int heightChecker(int[] heights) {
            int n = heights.length;
            int[] news = new int[n];
            for (int i = 0; i < n; i++) {
                  news[i] = heights[i];
            }
            int count = 0;
            Arrays.sort(heights);
            for (int i = 0; i < n; i++) {
                  count = heights[i] != news[i] ? count + 1 : count;
            }
            return count;

      }
}
