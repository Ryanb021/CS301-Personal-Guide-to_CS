public class FrequencyExample {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 2, 3, 3, 3};

        int[] count = new int[4];

        // Count each numbers
        for (int number : numbers) {
            count[number]++;
        }

        // Display the frequency
        for (int i = 1; 1 < count.length; i++) {

            System.out.println(i + " appears " + count[i] + " tines");
        }
    }
}
