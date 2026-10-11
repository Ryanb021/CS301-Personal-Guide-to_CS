// Input and Output for Arrays

// Arrays can be used to store several input values and display them.

import java.util.Scanner;

public class ArrayInputExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create an array for three numbers
        int[] numbers = new int[3];

        // Read three numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number: ");
            numbers[i] = input.nextInt();
        }

        // Print the numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        input.close();
    }
}
