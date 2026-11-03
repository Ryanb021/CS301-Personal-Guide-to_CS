// Observations

public class PerformanceExample {
    public static void main(String[] args) {
        
        long start = System.nanoTime();

        long sum = 0;

        // Add numbers from 1 to 1, 000, 000
        for (int i = 1; i < 1000000; i++) {
            sum += 1;
        }

        long end = System.nanoTime();

        System.out.println("Sum: " + sum);
        System.out.println("Time: " + (end - start) + " ns");
    }
}
