import java.util.Stack;

public class BracketMatching {
    public static boolean isProperlyMatched(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                // If an opening bracket is encountered, push it onto the stack.
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                // If a closing bracket is encountered, check if it matches the top of the stack.
                if (stack.isEmpty()) {
                    // If the stack is empty, there's no matching opening bracket.
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    // If there is a mismatch, return false.
                    return false;
                }
            }
        }

        // After processing all characters, the stack should be empty if brackets are properly matched.
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "{[()]}";
        String input2 = "{[(])}";
        
        boolean result1 = isProperlyMatched(input1); // Should return true
        boolean result2 = isProperlyMatched(input2); // Should return false
        
        System.out.println("Input 1 is properly matched: " + result1);
        System.out.println("Input 2 is properly matched: " + result2);
    }
}
