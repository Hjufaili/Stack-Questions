import java.util.Stack;

class TextEditor {
    private StringBuilder content;
    private Stack<String> history;

    public TextEditor() {
        this.content = new StringBuilder();
        this.history = new Stack<>();
    }

    /**
     * TO-DO: Appends text to the current content.
     * Before changing the content, save the current state to the history stack.
     \*
     * @param text The text to append.
     */
    public void type(String text) {
        // Your code here: Push the current content to history

        history.push(content.toString());
        this.content.append(text);

    }

    /**
     * TO-DO: Reverts the content to its state before the last 'type' operation.
     * If there is no history, the content should not change.
     */
    public void undo() {
        // Your code here: If history is not empty, pop and restore the content.
        if (!history.isEmpty()) {
            content = new StringBuilder(history.pop());

        }
    }

    public String getContent() {
        return content.toString();
    }
}