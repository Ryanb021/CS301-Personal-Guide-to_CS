// Binary Search

public class BinarySearchExample {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50};

        int target = 40;

        int low = 0;
        int high = numbers.length - 1;

        int result = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (numbers[mid] == target) {
                result = mid;
                break;
            }

            if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Index: " + result);
    }
}
