// Array Implementation

public class ArrayStackExample {
    public static void main(String[] args) {
        
        int[] stack = new int[5];

        int top = 0;

        // Push item
        stack[top++] = 10;
        stack[top++] = 20;
        stack[top++] = 30;

        // Pop the top item
        int removed = stack[--top];

        System.out.println("Removed: " + removed);
        System.out.println("Items left: " + top);
    }
}
