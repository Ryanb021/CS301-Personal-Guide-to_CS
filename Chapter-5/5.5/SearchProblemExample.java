// Search Problems

public class SearchProblemExample {
    public static void main(String[] args) {
        

        int[] numbers = {2, 4, 6, 8};

        int target = 10;

        // Find two numbers that add to 10
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target) {

                    System.out.println(numbers[i] + " + " + numbers[j]);
                }
            }
        }
    }
}
