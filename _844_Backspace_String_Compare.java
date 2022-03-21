import java.util.Stack;

public class _844_Backspace_String_Compare {
      public static void main(String[] args) {
            System.out.println(backspaceCompare("ab#c", "ad#c") == true);
            System.out.println(backspaceCompare("ab##", "c#d#") == true);
            System.out.println(backspaceCompare("a#c", "b") == false);
      }

      public static String bienDoi(String s) {
            Stack<Character> stack = new Stack<>();
            char[] arr = s.toCharArray();
            for (char c : arr) {
                  if (c != '#') {
                        stack.push(c);
                  } else {
                        if (stack.isEmpty() == false) {
                              stack.pop();
                        }
                  }
            }
            return stack.toString();
      }

      public static boolean backspaceCompare(String s, String t) {
            s = bienDoi(s);
            t = bienDoi(t);
            return s.equals(t);
      }
}
