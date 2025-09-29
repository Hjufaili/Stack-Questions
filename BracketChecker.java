import java.util.Stack;
class BracketChecker {
    /**
     * TO-DO: Refactor this method to remove its dependency on the three helper methods
     * (isOpening, isClosing, isMatchingPair) by inlining their logic.
     */
    public boolean isBalancedRefactored(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char c : expr.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                // Your code here for handling opening brackets
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                // Your code here for handling closing brackets
                // It should check if the stack is empty and if the popped element matches.
                // If not, return false immediately.
                if (!stack.isEmpty()){
                    if ((c==')' && stack.peek()=='(') ||
                            (c =='}' && stack.peek()=='{') ||
                            (c== ']' && stack.peek()=='['))
                        stack.pop();
                }
                else return false;

            }
        }
        return stack.isEmpty();
    }
}