import java.util.Stack;

class TaskManager {
    /**
     * TO-DO: Create a string showing the task sequence from bottom to top.
     * For a stack with ["Task C", "Task B", "Task A"] (top to bottom),
     * the output should be "Task A -> Task B -> Task C".
     \*
     * @param tasks The stack of task strings.
     * @return A formatted string of tasks.
     */
    public String getTaskSequence(Stack<String> tasks) {
        if (tasks.isEmpty()) {
            return "";
        }

        Stack<String> reversedStack = new Stack<>();
        // Your code here: move all elements from 'tasks' to 'reversedStack'.
        // This will leave 'tasks' empty.
        while (!tasks.isEmpty()){
            reversedStack.push(tasks.pop());

        }

        StringBuilder sequence = new StringBuilder();
        // Your code here: pop from 'reversedStack' to build the string.
        // Don't forget to add " -> " between tasks but not at the end.
        // Finally, restore the original 'tasks' stack by moving elements back.

        while (!reversedStack.isEmpty()){
            sequence.append(reversedStack.pop());
            if (!reversedStack.isEmpty()) {  // only add arrow if not last
                sequence.append(" -> ");
            }
            tasks.push(reversedStack.pop());
        }

        return sequence.toString();
    }
}