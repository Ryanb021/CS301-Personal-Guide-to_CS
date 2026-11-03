// MergeSort

import java.util.Arrays;

public class MergeSortExample {
    public static void main(String[] args) {

        int[] numbers = {8, 3, 5, 1, 9, 2};

        mergeSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    // Sort array
    public static void mergeSort(int[] a) {

        // Base case
        if (a.length <= 1) {
            return;
        }

        int mid = a.length / 2;

        // Divide into 2 arrays
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);

        // Sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge sorted arrays
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j <  right.length) {

            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }

        // Copy remaining values
        while (i < left.length) {
            a[k++] = left[i++];
        }

        while (j < right.length) {
            a[k++] = right[j++];
        }
    }
}
