import java.util.Stack;

public class L1190 {
    public static void main(String[] args) {
        System.out.println(reverseParentheses("obxdpc()z()cgeuqvpf(d())")); // Output should be "iloveu"
    }

    public static String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(') {
                stack.push(i);
            } else if (sb.charAt(i) == ')') {
                int start = stack.pop();
                reverse(sb, start + 1, i - 1);
            }
        }

        // Remove all parentheses
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '(' && sb.charAt(i) != ')') {
                result.append(sb.charAt(i));
            }
        }

        return result.toString();
    }

    private static void reverse(StringBuilder s, int si, int ei) {
        while (ei > si) {
            char ec = s.charAt(ei);
            char sc = s.charAt(si);

            // Swap parentheses
            if (ec == '(') {
                ec = ')';
            } else if (ec == ')') {
                ec = '(';
            }

            if (sc == '(') {
                sc = ')';
            } else if (sc == ')') {
                sc = '(';
            }

            s.setCharAt(ei, sc);
            s.setCharAt(si, ec);
            si++;
            ei--;
        }
    }
}
