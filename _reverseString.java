public class _reverseString {
      //abc = cba 
      public static String reveString(String x) {
            char[] old = x.toCharArray(); //tạo ra 1 mạng 
            char[] news = new char[x.length()]; // tạo ra 1 mảng mới bằng mảng == old 
            for (int i = 0; i < old.length; i++) {
                  news[news.length - 1 - i] = old[i];
            }
            return String.valueOf(news);
      }
      public static void main(String[] args) {
           System.out.println(reveString("abc"));
        }
}
