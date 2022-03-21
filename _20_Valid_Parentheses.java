import java.util.Stack;

public class _20_Valid_Parentheses {
      public static void main(String[] args) {
            System.out.println(isValid("()") == true);
            System.out.println(isValid("()[]{}") == true);
            System.out.println(isValid("{[()]}") == true);
            System.out.println(isValid("(]") == false);
            System.out.println(isValid("(") == false);
            System.out.println(isValid("]") == false);
      }

      public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            char[] arr = s.toCharArray();
            for (char c : arr) {
                  if (c == '(' || c == '{' || c == '[') {
                        stack.push(c);
                  }
                  else {
                        if (stack.isEmpty()) {
                              return false;
                        }
                        char p = stack.peek();
                        if ((c == ')' && p == '(') || (c == ']' && p == '[') || (c == '}' && p == '{')) {
                              stack.pop();
                        }
                        else {
                              return false; 
                        }
                        
                  }
            } 
            return stack.isEmpty(); 
      }
}
