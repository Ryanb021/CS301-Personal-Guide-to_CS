// Pushdown Stacks
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<>();

        // Add item
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        // Remove the newest item
        System.out.println(stack.pop());

        // Look at the top item
        System.out.println(stack.peek());
    }
}
