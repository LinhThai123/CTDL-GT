public class _66_Plus_One {
      public static void main(String[] args) {
            int[] digits = {1,2,3} ; 
            System.out.println(plusOne(digits));
      }
      public static int[] plusOne(int[] digits) {
            int n = digits.length;
            if (digits[n - 1] != 9) {
                  digits[n - 1] = digits[n - 1] + 1;
                  return digits;
            }
            int ans = n - 1;
            while (ans >= 0 && ans == 9) {
                  digits[ans] = 0;
                  ans--;
            }
            if (ans != -1) {
                  digits[ans]++;
                  return digits;
            }
            int[] newArr = new int[n + 1];
            newArr[0] = 1;
            return newArr;
      }
     
}
