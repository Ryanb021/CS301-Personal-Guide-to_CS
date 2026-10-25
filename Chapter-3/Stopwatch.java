// Java example of Stopwatch

public class Stopwatch {
    public static void main(String[] args) {
        
        // Record the starting time
        long start = System.currentTimeMillis();

        // Perform a simple task
        long total = 0;

        for (int  i = 1; i < 1000000; i++) {
            total += 1;
        }

        // Record the ending time
        long end = System.currentTimeMillis();

        // Calculate elapsed time
        long elapsed = end - start;

        System.out.println("Total: " + total);
        System.out.println("Time: " + elapsed + " ms");
    }    
}
