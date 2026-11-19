
import java.util.*;

class MinStack {

    ArrayList<Integer> stack;
    ArrayList<Integer> minStack;

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }

    public void push(int value) {
        stack.add(value);

        if(minStack.isEmpty() || value <= minStack.get(minStack.size()-1)) {
            minStack.add(value);
        }
    }

    public void pop() {
        int removed = stack.remove(stack.size()-1);

        if(removed == minStack.get(minStack.size()-1)) {
            minStack.remove(minStack.size()-1);
        }
    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public int getMin() {
        return minStack.get(minStack.size()-1);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna