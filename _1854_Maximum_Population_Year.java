public class _1854_Maximum_Population_Year {
      public static void main(String[] args) {
            
      }

      public int maximumPopulation(int[][] logs) {
            int[] arr = new int[2051];
            int  n= logs.length ; 
            for (int i = 0; i < n; i++) {
                  int song = logs[i][0];
                  int chet = logs[i][1];
                  for (int j = song - 1950; j < chet - 1950; j++) {
                        arr[i]++;
                  }
            }
            int k = -1;
            int year = -1;
            for (int i = 0; i < 2051; i++) {
                  if (arr[i] > k) {
                        k = arr[i];
                        year = i + 1950; 
                  }
            }
            
            return year ; 
      }
}
