/*
A function-call tree shows how a recursive method calls itself.

For example, Fibonacci numbers can be calculated recursively.
*/

public class FibonacciExample {

    // Find a Fibonacci number
    public static int fibonacci(int n) {

        // Base cases
        if(n <= 1) {
            return n;
        }

        // Two recursive calls
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        
        System.out.println(fibonacci(4));
    }
    
}
