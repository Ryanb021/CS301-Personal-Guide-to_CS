// Statistics help analyze numerical data.

// Common calculations include:

// Mean: The average of the numbers.

// Minimum: The smallest value.

// Maximum: The largest value.

public class StatisticsExample {
    public static void main(String[] args) {

        // Create an array
        int[] numbers = { 10, 20, 30, 40, 50 };

        int sum = 0;

        // Add all numbers
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        System.out.println("Average: " + average);
    }
}
