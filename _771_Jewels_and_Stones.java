public class _771_Jewels_and_Stones {
      public static void main(String[] args) {
            System.out.println(numJewelsInStones("aA", "aAAbbbb"));
      }
      public static int numJewelsInStones(String jewels, String stones) {
            int count=0;
            for(int i=0;i<jewels.length();i++)
            {
                for(int j=0;j<stones.length();j++)
                {
                    if(stones.charAt(j)==jewels.charAt(i))
                    count++;
                }
            }
            return count;
        }
}
