import java.util.Stack;
class PalindromeChecker {
    /**
     * TO-DO: Use a Stack to determine if a string is a palindrome.
     \*
     * @param input The string to check.
     * @return true if the string is a palindrome, false otherwise.
     */
    public boolean isPalindrome(String input) {
        String lowercased = input.toLowerCase();
        Stack<Character> stack = new Stack<>();
        // Your code here: Push all characters of 'lowercased' onto the stack.

        for (char c : lowercased.toCharArray())
            stack.push(c);
        StringBuilder reversed = new StringBuilder();
        // Your code here: Pop all characters from the stack and append to 'reversed'.
        while (!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return lowercased.equals(reversed.toString()); // Placeholder: Compare 'lowercased' with the reversed string.
    }
}