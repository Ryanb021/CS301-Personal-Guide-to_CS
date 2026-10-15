/*
Dynamic programming solves problems by saving answers to smaller problems instead of calculating them repeatedly.

For example, Fibonacci numbers can be calculated using an array.

Dynamic programming can make some recursive problems faster by avoiding repeated work.
*/

public class DynamicExample {

    public static void main(String[] args) {
        
        int n = 6;

        // Store fibonacci numbers
        int[] fib = new int[n + 1];

        fib[0] = 0;
        fib[1] = 1;

        // Calculate each number once
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println(fib[n]);
    }
}