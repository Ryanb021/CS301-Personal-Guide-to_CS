// Coping with NP-Completeness

public class GreedyExample {
    public static void main(String[] args) {
        
        int[] numbers = {8, 6, 4, 2};

        int target = 10;
        int sum = 0;

        // Choose numbers without exceeding target
        for (int number : numbers) {

            if (sum + number <= target) {
                sum += number;
            }
        }

        System.out.println("Total: " + sum);
    }
}
