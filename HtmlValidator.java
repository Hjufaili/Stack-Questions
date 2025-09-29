import java.util.Stack;

class HtmlValidator {
    /**
     * TO-DO: Check if an array of HTML tags is well-formed.
     \*
     * @param tags An array of strings, where each string is a tag like "<html>" or "</html>".
     * @return true if the tags are properly nested and balanced, false otherwise.
     */
    public boolean isWellFormed(String[] tags) {
        Stack<String> tagStack = new Stack<>();

        for (String tag : tags) {

            if (tag.startsWith("</")) { // This is a closing tag
                // Your code here:
                // 1. Get the tag name (e.g., "p" from "</p>").
                // 2. Check if the stack is empty. If so, return false.
                // 3. Pop from the stack and check if it matches the closing tag's name. If not, return false.

                String tagName= tag.substring(2,tag.length()-1);

                if (tagStack.isEmpty()) return false;
                if (!tagStack.pop().equals(tagName)) return false;


            } else { // This is an opening tag
                // Your code here:
                // 1. Get the tag name (e.g., "html" from "<html>").
                // 2. Push the tag name onto the stack.

                String tagName= tag.substring(1,tag.length()-1);

                tagStack.push(tagName);
            }
        }

        // Your code here:
        // After checking all tags, what must be true about the stack
        // for the HTML to be considered well-formed?
        return tagStack.isEmpty(); // Placeholder
    }
}