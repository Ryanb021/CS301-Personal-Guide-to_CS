// Proving a problem to be NP-Complete

public class VerifySolution {
    public static void main(String[] args) {
        
        int[] numbers = {2, 8};

        int sum = 0;

        // Verify the proposed solution
        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum == 10);
    }
}
