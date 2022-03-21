public class _1108_Defanging_an_IP_Address {
      public static void main(String[] args) {
            System.out.println(defangIPaddr("1.1.1.1"));
      }

      public static String defangIPaddr(String address) {
            String ans = address.replace(".","[.]");
            return ans;   
      }
}
