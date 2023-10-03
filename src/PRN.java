import java.util.Stack;

class isValid {
    public Boolean VPRN(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '(') {
                stack.push(')');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();

    }

}

    public class PRN {
        public static void main(String[] args) {
            isValid net = new isValid();

            boolean ans = net.VPRN("{]");
            System.out.println(ans);
        }
    }


