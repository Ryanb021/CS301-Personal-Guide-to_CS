public class ConditionalsLoops {
    public static void main(String[] args) {

        // Store a number
        int score = 90;

        // Check if the score is 70 or higher
        if (score >= 70) {

            // This runs if the condition is true
            System.out.println("You Passed!");
        }

        // If-Else Statement: gives the program two choices.

        // Check the person's age
        int age = 16;

        if (age >= 18) {

            // Runs when the condition is true
            System.out.println("Adult");

        } else {

            // Runs when the condition is false
            System.out.println("Minor");
        }

        // While Loop: Repeats code while a condition is true
        int count = 1;

        // Repeat while count is 5 or less
        while (count <= 5) {

            // Print the current number
            System.out.println(count);

            // Add 1 to count
            count++;
        }

        // For Loop: Use this if I know how many times I want something to repeat.

        //Repeat 5 times
        for (int i = 1; i <= 5; i++) {

            // Print current value of i
            System.out.println(i);
        }
    }
}
