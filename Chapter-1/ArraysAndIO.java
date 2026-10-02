import java.util.Scanner;

public class ArraysAndIO {

    public static void main(String[] args) {

        // Create an array of integers
        int[] numbers = { 10, 20, 30, 40, 50 };

        System.out.println("Array:");

        // Print all values in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Print the first value
        System.out.println("First value: " + numbers[0]);

        // Print the length of the array
        System.out.println("Array length: " + numbers.length);

        // Create a 2D array
        int[][] table = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        System.out.println("\n2D Array:");

        // Go through each row
        for (int row = 0; row < table.length; row++) {

            // Go through each column
            for (int col = 0; col < table[row].length; col++) {

                // Print each value
                System.out.print(table[row][col] + " ");
            }

            // Start a new line after each row
            System.out.println();
        }

        // println moves to a new line
        System.out.println("\nStandard Output");

        // print stays on the same line
        System.out.print("Hello ");
        System.out.print("World!");

        System.out.println();

        // Create Scanner for keyboard input
        Scanner input = new Scanner(System.in);

        // Ask the user for a whole number
        System.out.print("\nEnter a whole number: ");
        int userNumber = input.nextInt();

        // Display the number
        System.out.println("You entered: " + userNumber);

        // Ask the user for a decimal number
        System.out.print("Enter a decimal number: ");
        double userDecimal = input.nextDouble();

        // Display the decimal number
        System.out.println("You entered: " + userDecimal);

        // REDIRECTION AND PIPING

        // Input can come from a file:
        // java ArraysAndIO < input.txt

        // Output can be saved to a file:
        // java ArraysAndIO > output.txt

        // Output from one program can become
        // input for another program:
        // java Program1 | java Program2

        // Close Scanner
        input.close();
    }
}