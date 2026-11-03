// Insertion Sort

public class InsertionSortExample {
    public static void main(String[] args) {
        
        int[] numbers = {5, 3, 4, 1, 2};

        // Start with the second element
        for (int  i = 1; i < numbers.length; i++) {

            int key = numbers[i];
            int j = i - 1;

            // Move larger numbers to the right
            while (j >= 0 && numbers[j] > key) {

                numbers[j + 1] = numbers[j];
                j--;
            }

            // Insert the value
            numbers[j + 1] = key;
        }

        System.out.println(numbers);
    }
}
