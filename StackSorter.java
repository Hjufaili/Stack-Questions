import java.util.Stack;

class StackSorter {
    /**
     * TO-DO: Sort the given stack so that the smallest element is at the top.
     * You may use a temporary stack, but no other data structures.
     \*
     * @param stack The stack of integers to be sorted.
     */
    public void sortStack(Stack<Integer> stack) {
        Stack<Integer> sortedStack = new Stack<>();

        // Your code here.
        // While the original stack is not empty...
        // Pop an element.
        // While the sorted stack is not empty and its top is smaller than the element...
        // Move elements from sorted back to original.
        // Push the element to the sorted stack.

        Integer stackElement=stack.pop();
        while (!stack.isEmpty()){
            sortedStack.push(stackElement);
            while (!sortedStack.isEmpty() && sortedStack.peek()<stackElement){
                stack.push(sortedStack.pop());
                sortedStack.push(stackElement);
            }
        }




        // After the main loop, copy the sorted stack back to the original stack.

        while (!sortedStack.isEmpty()){
            stack.push(sortedStack.pop());
        }
        }


    }
