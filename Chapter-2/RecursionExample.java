// Counting down from 5 as a simple recursion example program.

public class RecursionExample {

    // Recursive method
    public static void countdown(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        // Print the current number
        System.out.println(n);

        // Call the method again
        countdown(n - 1);
    }

    public static void main(String[] args) {

        // Start counting down
        countdown(5);
    }
}
