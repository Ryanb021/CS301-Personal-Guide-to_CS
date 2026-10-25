public class HistogramExample {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 2, 3, 3, 3};

        int[] count = new int[4];

        // Count each number
        for (int i = 0; i < numbers.length; i++) {
            count[numbers[i]]++;
        }

        // Display the results
        for (int i = 1; i < count.length; i++) {
            System.out.println(i + ": " + count[i]);
        }
    }
}
